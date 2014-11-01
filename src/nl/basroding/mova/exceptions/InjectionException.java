package nl.basroding.mova.exceptions;

public class InjectionException extends RuntimeException{

    @Override
    public String getMessage()
    {
        return "Failed to inject value";
    }
    
}
