package edu.yisus.tarea5.process;

import java.util.Random;

import java.util.Random;

public class GameGenerator {
    private String[] easyWord = {"casa"};
    private String[] intermediateWord = {"programa"};
    private String[] advancedWord = {"enciclopedia"};

    private String level;
    private String word;
    private char[] guesses;
    public int remainingAttempts;

    public GameGenerator(String level) {
        this.level = level;
        InitializeWord();
        this.guesses = new char[word.length()];
        this.remainingAttempts = 4;
    }

    private void InitializeWord() {
        Random random = new Random();
        String[] selectedWords = null;
        if (level.equals("easy")) {
            selectedWords = easyWord;
        } else if (level.equals("intermediate")) {
            selectedWords = intermediateWord;
        } else if (level.equals("advanced")) {
            selectedWords = advancedWord;
        }
        if (selectedWords != null) {
            int index = random.nextInt(selectedWords.length);
            this.word = selectedWords[index];
        }
    }

    public boolean isValidGuess(String guess) {
        return guess.length() == 1 && Character.isLetter(guess.charAt(0));
    }

    public boolean MakeGuess(char guess) {
        boolean correctGuess = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess) {
                guesses[i] = guess;
                correctGuess = true;
            }
        }
        if (!correctGuess) {
            remainingAttempts--;
        }
        return correctGuess;
    }

    public boolean IsGameOver() {
        if (remainingAttempts == 0) {
            return true;
        }
        return word.equals(String.valueOf(guesses));
    }

    public String GetDisplayWord() {
        StringBuilder displayWord = new StringBuilder();
        for (char guess : guesses) {
            if (Character.isLetter(guess)) {
                displayWord.append(guess);
            } else {
                displayWord.append('_');
            }
        }
        return displayWord.toString();
    }
}

