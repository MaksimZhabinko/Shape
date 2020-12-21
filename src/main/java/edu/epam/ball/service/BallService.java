package edu.epam.ball.service;

import edu.epam.ball.entity.Ball;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BallService {

    private static final Logger logger = LogManager.getLogger(BallService.class);

    public double findArea(Ball ball) {
        double area = 4 * Math.PI * Math.pow(ball.getRadius(), 2);
        logger.info("area = " + area);
        return area;
    }

    public double findVolume(Ball ball) {
        double volume = 4 / 3.0 * Math.PI * Math.pow(ball.getRadius(), 3);
        logger.info("volume = " + volume);
        return volume;
    }

    public double findRatioOfVolumes(Ball ball){
        double fullRadius = ball.getRadius();
        double distance = findMinDistanceToPlane(ball);
        double ratio = 0.0;
        if (Double.compare(fullRadius, distance) > 0){
            double h = fullRadius - distance;
            double radius = Math.sqrt(Math.pow(fullRadius, 2) - Math.pow(fullRadius - h, 2));
            double partOne = Math.PI * Math.pow(h, 2) * (radius - (1 / 3) * h);
            double partTwo = findVolume(ball) - partOne;
            ratio = partTwo / partOne;
        } else {
            logger.error("shape doesn't cross any plane");
        }
        return ratio;
    }

    public double findMinDistanceToPlane(Ball ball) {
        double pointCoordinateX = ball.getPoint().getX();
        double minDistance = Math.abs(pointCoordinateX);
        double pointCoordinateY = ball.getPoint().getY();
        double distanceByY = Math.abs(pointCoordinateY);
        if (Double.compare(minDistance, distanceByY) > 0) {
            minDistance = distanceByY;
        }
        double pointCoordinateZ = ball.getPoint().getZ();
        double distanceByZ = Math.abs(pointCoordinateZ);
        if (Double.compare(minDistance, distanceByZ) > 0) {
            minDistance = distanceByZ;
        }
        logger.info("minDistance = " + minDistance);
        return minDistance;
    }

    public boolean isTouch(Ball ball) {
        double pointCoordinateX = ball.getPoint().getX() - ball.getRadius();
        double pointCoordinateY = ball.getPoint().getY() - ball.getRadius();
        double pointCoordinateZ = ball.getPoint().getZ() - ball.getRadius();
        if (pointCoordinateX <= 0 || pointCoordinateY <= 0 || pointCoordinateZ <= 0) {
            return true;
        }
        return false;
    }
}
