package edu.epam.ball.entity;

import edu.epam.ball.observer.Observable;
import edu.epam.ball.observer.impl.BallObserver;

import java.util.ArrayList;
import java.util.List;

public class Ball extends Shape implements Observable<BallObserver> {
    Point point;
    private double radius;
    private List<BallObserver> observerList = new ArrayList<>();

    public Ball(Point point, double radius) {
        super();
        this.point = point;
        this.radius = radius;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
        notifyObserver();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        notifyObserver();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ball ball = (Ball) o;

        if (Double.compare(ball.radius, radius) != 0) return false;
        return point != null ? point.equals(ball.point) : ball.point == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = point != null ? point.hashCode() : 0;
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ball{");
        sb.append("point=").append(point);
        sb.append(", radius=").append(radius);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void attach(BallObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(BallObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        if (!observerList.isEmpty()) {
            for (BallObserver observer : observerList) {
                observer.performedArea(this);
                observer.performedVolume(this);
            }
        }
    }
}
