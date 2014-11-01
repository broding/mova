package nl.basroding.mova.exceptions;

public class ContextMappingException extends RuntimeException {

    @Override
    public String getMessage()
    {
        return "Could not map this.";
    }
    
}
