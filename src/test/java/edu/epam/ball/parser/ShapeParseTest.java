package edu.epam.ball.parser;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.*;

public class ShapeParseTest {

    private ShapeParse shapeParse = new ShapeParse();

    @Test
    public void testParse() {
        List<String> list = new ArrayList<>();
        list.add("0.0 0.0 3.0 20.0");
        list.add("0.0 0.0 5.0 30.0");
        list.add("3.0 5.0 2.0z 2.2");
        list.add("5.0a 7.0 z 35.0");
        list.add("2.0 4.0 7.0 40.0");
        List<List<String>> actual = shapeParse.parse(list);
        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList("0.0, 0.0, 3.0, 20.0"));
        expected.add(Arrays.asList("0.0, 0.0, 5.0, 30.0"));
        expected.add(Arrays.asList("2.0, 4.0, 7.0, 40.0"));
        assertEquals(actual, expected);
    }
}
