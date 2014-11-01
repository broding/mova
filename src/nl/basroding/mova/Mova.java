package nl.basroding.mova;

import java.lang.reflect.Field;
import nl.basroding.mova.exceptions.ContextMissingException;
import nl.basroding.mova.exceptions.InjectionException;

public class Mova {
    
    public static boolean event(ViewEvent event)
    {
        return instance.dispatchEvent(event);
    }
    
    private static Mova instance;
    
    private static Mova instance()
    {
        if(instance == null)
            instance = new Mova();
        
        return instance;
    }
    
    private Context context;
    
    static void setContext(Context context)
    {
        instance().context = context;
    }
    
    private boolean dispatchEvent(ViewEvent event)
    {
        if(context == null)
            throw new ContextMissingException();
        
        if(!context.getMapper().doesEventHasMediator(event))
            return false;
        
        Mediator mediator = context.getMapper().getMediator(event);
        inject(event, mediator);
        mediator.execute();
        
        return true;
    }
    
    private void inject(ViewEvent event, Mediator mediator)
    {
        Field[] fields = mediator.getClass().getFields();
        for(int i = 0; i < fields.length; i++)
        {
            if(fields[i].isAnnotationPresent(Inject.class))
            {
                try {
                    fields[i].set(mediator, event);
                } catch (IllegalArgumentException | IllegalAccessException ex) {
                    throw new InjectionException();
                }
                
                return;
            }
        }
    }
}
