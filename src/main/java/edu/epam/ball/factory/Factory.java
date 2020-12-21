package edu.epam.ball.factory;

import edu.epam.ball.entity.Ball;
import edu.epam.ball.entity.Point;
import edu.epam.ball.exception.BallFactoryException;
import edu.epam.ball.validator.BallValidator;

public class Factory {
    public Ball createShape(Point point, double radius) throws BallFactoryException {
        if (!BallValidator.isValid(radius)) {
            throw new BallFactoryException("ball is invalid");
        }
        Ball ball = new Ball(point, radius);
        return ball;
    }
}
