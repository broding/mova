package nl.basroding.mova;

public abstract class Action {
    
    private Model model;

    void setup(Model parentModel)
    {
        model = parentModel;
    }
    
    protected Model getModel()
    {
        return model;
    }
    
    public abstract boolean run();
}
