package edu.epam.ball.specification.impl;

import edu.epam.ball.entity.Ball;
import edu.epam.ball.service.BallService;
import edu.epam.ball.specification.Specification;

public class VolumeSpecification implements Specification<Ball> {
    private final double from;
    private final double to;

    public VolumeSpecification(double from, double to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean specify(Ball ball) {
        double volume = new BallService().findVolume(ball);
        return volume >= from && volume <= to;
    }
}
