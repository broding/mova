package nl.basroding.mova;

public class ActionRunner {

    private Model parentModel;
    
    public void run(Action action)
    {
        action.setup(parentModel);
        action.run();
    }

    public void setParentModel(Model model)
    {
        parentModel = model;
    }
}
