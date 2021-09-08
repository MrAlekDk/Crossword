package demo;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import java.nio.file.Paths;
import java.util.stream.Stream;


public class FileReader {

    public FileReader() {
    }

    public Stream<String> readFile(String path) throws IOException {
        Stream<String> allLines = Files.lines(Paths.get(path), StandardCharsets.UTF_16);
        return allLines;
    }


}
