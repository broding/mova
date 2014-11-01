package nl.basroding.mova;

import java.util.HashMap;
import java.util.Map;
import nl.basroding.mova.exceptions.ContextMappingException;

public class Mapper {
    
    private final Map<Class<? extends ViewEvent>, Mediator> mediatorMap;
    private ActionRunner runner;
    
    public Mapper()
    {
        mediatorMap = new HashMap<>();
    }
    
    public void map(Class<? extends ViewEvent> event, Class<? extends Mediator> mediator)
    {
        try
        {
            Mediator newMediator = mediator.newInstance();
            newMediator.setup(runner);
            mediatorMap.put(event, newMediator);
        } catch (InstantiationException | IllegalAccessException ex)
        {
            throw new ContextMappingException();
        }
    }
    
    public boolean doesEventHasMediator(ViewEvent event)
    {
        return mediatorMap.containsKey(event.getClass());
    }

    public Mediator getMediator(ViewEvent event)
    {
        return mediatorMap.get(event.getClass());
    }

    void setRunner(ActionRunner runner)
    {
        this.runner = runner;
    }
}
