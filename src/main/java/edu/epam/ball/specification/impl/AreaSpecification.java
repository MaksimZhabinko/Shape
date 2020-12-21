package edu.epam.ball.specification.impl;

import edu.epam.ball.entity.Ball;
import edu.epam.ball.service.BallService;
import edu.epam.ball.specification.Specification;

public class AreaSpecification implements Specification<Ball> {
    private final double from;
    private final double to;

    public AreaSpecification(double from, double to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean specify(Ball ball) {
        double area = new BallService().findArea(ball);
        return area >= from && area <= to;
    }
}
