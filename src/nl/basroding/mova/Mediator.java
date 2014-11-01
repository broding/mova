package nl.basroding.mova;

public abstract class Mediator<T extends ViewEvent> 
{
    private ActionRunner runner;
    
    void setup(ActionRunner runner)
    {
        this.runner = runner;
    }
    
    protected void run(Action action)
    {
        runner.run(action);
    }
    
    public abstract void execute();
}
