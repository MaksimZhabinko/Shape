package edu.epam.ball.comparator;

import edu.epam.ball.entity.Ball;

import java.util.Comparator;

public class IdComparator implements Comparator<Ball> {
    @Override
    public int compare(Ball o1, Ball o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}
