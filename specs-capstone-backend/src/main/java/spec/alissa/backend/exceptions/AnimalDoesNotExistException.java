package spec.alissa.backend.exceptions;

public class AnimalDoesNotExistException extends Exception{
    public AnimalDoesNotExistException(String message) {
        super(message);
    }
}
