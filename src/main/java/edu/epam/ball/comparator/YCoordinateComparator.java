package edu.epam.ball.comparator;

import edu.epam.ball.entity.Ball;

import java.util.Comparator;

public class YCoordinateComparator implements Comparator<Ball> {
    @Override
    public int compare(Ball o1, Ball o2) {
        return Double.compare(o1.getPoint().getY(), o2.getPoint().getY());
    }
}
