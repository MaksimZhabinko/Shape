package edu.epam.ball.reader;

import edu.epam.ball.exception.CannotFindFileException;
import edu.epam.ball.exception.DataReaderException;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class DataReaderTest {

    private DataReader reader = new DataReader();

    @Test
    public void testReadFile() throws CannotFindFileException, DataReaderException {
        List<String> actual = reader.readFile();
        List<String> expected = new ArrayList<>();
        expected.add("0.0 0.0 3.0 20.0");
        expected.add("0.0 0.0 5.0 30.0");
        expected.add("3.0 5.0 2.0z 2.2");
        expected.add("5.0a 7.0 z 35.0");
        expected.add("2.0 4.0 7.0 40.0");
        assertEquals(actual, expected);
    }
}
