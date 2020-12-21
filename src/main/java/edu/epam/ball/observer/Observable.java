package edu.epam.ball.observer;

public interface Observable<E> {
    void attach(E observer);
    void detach(E observer);
    void notifyObserver();
}
