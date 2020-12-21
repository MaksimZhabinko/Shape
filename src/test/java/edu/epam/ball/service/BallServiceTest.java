package edu.epam.ball.service;

import edu.epam.ball.entity.Ball;
import edu.epam.ball.entity.Point;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BallServiceTest {

    private Ball ball = new Ball(new Point(2.0, 4.0, 7.0), 20.0);
    private BallService service = new BallService();

    @Test
    public void testFindArea() {
        double actual = service.findArea(ball);
        double expected = 5026.548245743669;
        assertEquals(actual, expected);
    }

    @Test
    public void testFindVolume() {
        double actual = service.findVolume(ball);
        double expected = 33510.32163829113;
        assertEquals(actual, expected);
    }

    @Test
    public void testFindRatioOfVolumes() {
        double actual = service.findRatioOfVolumes(ball);
        double expected = 0.6543832349945878;
        assertEquals(actual, expected);
    }

    @Test
    public void testFindMinDistanceToPlane() {
        double actual = service.findMinDistanceToPlane(ball);
        double expected = 2.0;
        assertEquals(actual, expected);
    }

    @Test
    public void testIsBall() {
    }

    @Test
    public void testIsTouch() {
        boolean condition = service.isTouch(ball);
        assertTrue(condition);
    }
}
