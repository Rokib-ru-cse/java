package exception;

public class CustomException extends Exception {
    CustomException() {
    }

    CustomException(String message) {
        super(message);
    }

    CustomException(Throwable cause) {
        super(cause);
    }

    CustomException(String message, Throwable cause) {
        super(message, cause);
    }
}
