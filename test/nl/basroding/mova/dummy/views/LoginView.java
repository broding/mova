package nl.basroding.mova.dummy.views;

import nl.basroding.mova.Mova;
import nl.basroding.mova.View;
import nl.basroding.mova.ViewEvent;

public class LoginView implements View{
    
    public void doSomething()
    {
        Mova.event(new NameEnteredEvent("Bas"));
    }
    
    public class NameEnteredEvent implements ViewEvent
    {
        public final String name;
        
        public NameEnteredEvent(String name)
        {
            this.name = name;
        }
    }
}
