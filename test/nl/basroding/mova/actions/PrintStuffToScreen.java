package nl.basroding.mova.actions;

import nl.basroding.mova.Action;

public class PrintStuffToScreen extends Action{
    
    private final String stuff;
    
    public PrintStuffToScreen(String stuff)
    {
        this.stuff = stuff;
    }

    @Override
    public boolean run()
    {
        System.out.println(stuff);  
        
        return true;
    }
}
