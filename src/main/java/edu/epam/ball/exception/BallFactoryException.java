package edu.epam.ball.exception;

public class BallFactoryException extends Exception {
    public BallFactoryException() {
        super();
    }

    public BallFactoryException(String message) {
        super(message);
    }

    public BallFactoryException(String message, Throwable cause) {
        super(message, cause);
    }

    public BallFactoryException(Throwable cause) {
        super(cause);
    }
}
