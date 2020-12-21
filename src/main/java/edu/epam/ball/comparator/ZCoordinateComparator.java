package edu.epam.ball.comparator;

import edu.epam.ball.entity.Ball;

import java.util.Comparator;

public class ZCoordinateComparator implements Comparator<Ball> {
    @Override
    public int compare(Ball o1, Ball o2) {
        return Double.compare(o1.getPoint().getZ(), o2.getPoint().getZ());
    }
}
