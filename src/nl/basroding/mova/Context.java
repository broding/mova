package nl.basroding.mova;

public abstract class Context 
{
    public ContextSettings settings;
    
    private final Mapper mapper;
    private final ActionRunner runner;
    
    public Context()
    {
        settings = new ContextSettings(new Model());
        
        mapper = new Mapper();
        runner = new ActionRunner();
        
        mapper.setRunner(runner);
    }
    
    public void setSettings(ContextSettings settings)
    {
        this.settings = settings;
    }

    public Mapper getMapper()
    {
        return mapper;
    }
    
    public void run()
    {   
        Mova.setContext(this);
        runner.setParentModel(settings.getParentModel());
    }
}
