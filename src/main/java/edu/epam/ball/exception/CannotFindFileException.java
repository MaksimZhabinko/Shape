package edu.epam.ball.exception;

public class CannotFindFileException extends Exception {
    public CannotFindFileException() {
        super();
    }

    public CannotFindFileException(String message) {
        super(message);
    }

    public CannotFindFileException(String message, Throwable cause) {
        super(message, cause);
    }

    public CannotFindFileException(Throwable cause) {
        super(cause);
    }
}
