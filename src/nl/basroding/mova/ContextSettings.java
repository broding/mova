package nl.basroding.mova;

public class ContextSettings {
    
    private final Model parentModel;
    
    public ContextSettings(Model parentModel)
    {
        this.parentModel = parentModel;
    }

    public Model getParentModel()
    {
        return parentModel;
    }
}
