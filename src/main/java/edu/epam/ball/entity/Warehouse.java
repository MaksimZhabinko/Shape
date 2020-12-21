package edu.epam.ball.entity;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    public static final Warehouse instance = new Warehouse();
    private final Map<Integer, BallParameter> map;

    private Warehouse() {
        map = new HashMap<>();
    }

    public static Warehouse getInstance() {
        return instance;
    }

    public Map<Integer, BallParameter> getMap() {
        return map;
    }

    public BallParameter getId(int id) {
        return map.get(id);
    }

    public void put(int id, BallParameter ballParameter) {
        map.put(id, ballParameter);
    }

    public void remove(int id) {
        map.remove(id);
    }
}
