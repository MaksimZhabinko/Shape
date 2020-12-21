package edu.epam.ball.validator;

import java.util.regex.Pattern;

public class DoubleParamsValidator {
    private final static String DOUBLES_VALIDATOR =
            "-?\\d+.\\d+\\s+-?\\d+.\\d+\\s+-?\\d+.\\d+\\s+\\d+.\\d+";

    private DoubleParamsValidator() {
    }

    public static boolean isSuitable(String parameterSet) {
        String stripSet = parameterSet.trim();
        return Pattern.matches(DOUBLES_VALIDATOR, stripSet);
    }
}
