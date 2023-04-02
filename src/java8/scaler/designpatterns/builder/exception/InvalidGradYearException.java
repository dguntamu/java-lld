package java8.scaler.designpatterns.builder.exception;

public class InvalidGradYearException extends Exception{
    public InvalidGradYearException() {
        super();
    }

    public InvalidGradYearException(String message) {
        super(message);
    }

    public InvalidGradYearException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidGradYearException(Throwable cause) {
        super(cause);
    }

    protected InvalidGradYearException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
