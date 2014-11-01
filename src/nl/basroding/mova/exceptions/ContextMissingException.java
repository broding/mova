package nl.basroding.mova.exceptions;

public class ContextMissingException extends RuntimeException {

    @Override
    public String getMessage()
    {
        return "Context is needed but is not set correctly.";
    }
    
}
