package edu.epam.ball.reader;


import edu.epam.ball.exception.CannotFindFileException;
import edu.epam.ball.exception.DataReaderException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class DataReader {

    private static final Logger logger = LogManager.getLogger(DataReader.class);
    private static final String PATH = "data/data.txt";

    public List<String> readFile() throws DataReaderException, CannotFindFileException {
        List<String> lines;
        try (BufferedReader reader = new BufferedReader(new FileReader(PATH))) {
            lines = reader.lines().collect(Collectors.toList());
        } catch (FileNotFoundException e) {
            logger.error("file not found");
            throw new CannotFindFileException(e);
        } catch (IOException e) {
            logger.error(e);
            throw new DataReaderException(e);
        }
        logger.info("String array with lines from file: {}", lines);
        return lines;
    }
}
