package edu.epam.ball.comparator;

import edu.epam.ball.entity.Ball;

import java.util.Comparator;

public class RadiusComparator implements Comparator<Ball> {
    @Override
    public int compare(Ball o1, Ball o2) {
        return Double.compare(o1.getRadius(), o2.getRadius());
    }
}
