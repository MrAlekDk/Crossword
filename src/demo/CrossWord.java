package demo;

import java.util.List;

public class CrossWord {

    char[][] theCrossWord;
    List<Character> usedCharacters;

    public CrossWord() {

    }

    public void addWord(String wordToAdd) {

    }

    public boolean contains(char letterToCheck) {
        if (usedCharacters.contains(letterToCheck)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Hello";
    }

}
