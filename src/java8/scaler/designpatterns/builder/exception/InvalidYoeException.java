package java8.scaler.designpatterns.builder.exception;

public class InvalidYoeException extends RuntimeException{
    public InvalidYoeException() {
        super();
    }

    public InvalidYoeException(String message) {
        super(message);
    }

    public InvalidYoeException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidYoeException(Throwable cause) {
        super(cause);
    }

    protected InvalidYoeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
