package edu.epam.ball.entity;

import edu.epam.ball.util.IdGeneration;

public abstract class Shape {
    private int id;

    public Shape() {
        this.id = IdGeneration.generateOvalId();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shape shape = (Shape) o;

        return id == shape.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Shape{");
        sb.append("id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
