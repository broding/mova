package nl.basroding.mova.dummy.views;

import nl.basroding.mova.Inject;
import nl.basroding.mova.actions.PrintStuffToScreen;
import nl.basroding.mova.Mediator;
import nl.basroding.mova.dummy.views.LoginView;

public class CheckLoginData extends Mediator<LoginView.NameEnteredEvent> {
    
    @Inject
    public LoginView.NameEnteredEvent event;

    @Override
    public void execute()
    {
        run(new PrintStuffToScreen(event.name));
    }
}
