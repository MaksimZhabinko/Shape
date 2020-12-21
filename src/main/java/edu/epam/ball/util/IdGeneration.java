package edu.epam.ball.util;

public class IdGeneration {
    private static int count;

    private IdGeneration() {}

    public static int generateOvalId() {
        return count++;
    }
}
