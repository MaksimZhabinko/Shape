package edu.epam.ball.specification;

public interface Specification<T> {
    boolean specify(T t);
}
