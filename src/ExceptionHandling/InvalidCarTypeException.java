package ExceptionHandling;

public class InvalidCarTypeException extends Exception{
    public InvalidCarTypeException(String message){
        super(message);
    }
}