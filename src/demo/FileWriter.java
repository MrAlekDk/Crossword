package demo;

import java.io.*;
import java.util.stream.Stream;

public class FileWriter {

    public FileWriter(){

    }

    public void writeToNewFile(Stream<String> allLines, String newFileName){

        try {
            PrintWriter pw = new PrintWriter(new File("resources/"+newFileName));
            allLines.filter(word -> word.matches("^[a-zæøåA-ZÆØÅ]*$"))
                    .sorted()
                    .forEach(word -> pw.append(word.toLowerCase() + "\n"));
            pw.checkError();
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
