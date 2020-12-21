package edu.epam.ball.parser;

import edu.epam.ball.validator.DoubleParamsValidator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeParse {
    private final static String PARAMETERS_DELIMITER = "\\s+";

    public List<List<String>> parse(List<String> stringData) {
        List<List<String>> ballParameters = new ArrayList<>();
        for (String parameterSet: stringData) {
            if (DoubleParamsValidator.isSuitable(parameterSet)){
                ballParameters.add(new ArrayList<>(Arrays.asList(parameterSet.split(PARAMETERS_DELIMITER))));
            }
        }
        return ballParameters;
    }
}
