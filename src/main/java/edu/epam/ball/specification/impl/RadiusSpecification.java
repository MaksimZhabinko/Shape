package edu.epam.ball.specification.impl;

import edu.epam.ball.entity.Ball;
import edu.epam.ball.specification.Specification;

public class RadiusSpecification implements Specification<Ball> {
    private final double from;
    private final double to;

    public RadiusSpecification(double from, double to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean specify(Ball ball) {
        return ball.getRadius() >= from && ball.getRadius() <= to;
    }
}
