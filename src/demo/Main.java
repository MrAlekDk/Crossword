package demo;

import java.io.IOException;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {

        String newFileName = "crosswords_with_standard";

        FileReader fr = new FileReader();
        FileWriter fw = new FileWriter();
        CrosswordPuzzleMaker cpm = new CrosswordPuzzleMaker();
        fw.writeToNewFile(fr.readFile("resources/3LetterWord_Unicode.txt"),newFileName);


        Stream<String> allWords = fr.readFile("resources/"+newFileName);
        cpm.makeCrossWordPuzzles(allWords);


    }
}
