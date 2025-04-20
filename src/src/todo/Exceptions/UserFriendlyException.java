package todo.Exceptions;

public class UserFriendlyException extends RuntimeException{
    public UserFriendlyException(String message) {
        super(message);
    }
}
