package edu.epam.ball.observer;

import edu.epam.ball.entity.Shape;

public interface Observer<T extends Shape> {
    void performedArea(T t);
    void performedVolume(T t);
}
