package edu.yisus.RetoFinal.Tictactoe;
import edu.yisus.RetoFinal.UI.Languages.LanguagesFactory;

import java.io.*;
import java.util.*;

public class ScoreBoard {
    private Map<String, Integer> scores;

    public ScoreBoard() {
        scores = new HashMap<>();
    }

    public void addScore(String playerName, int score) {
        scores.put(playerName, scores.getOrDefault(playerName, 0) + score);
    }

    public void printScores() {
        scores.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }

    public void saveScoresToFile(String fileName) {
        try (PrintWriter writer = new PrintWriter(new File(fileName))) {
            scores.entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                    .forEach(entry -> writer.println(entry.getKey() + ": " + entry.getValue()));
        } catch (FileNotFoundException e) {
            System.out.println(LanguagesFactory.getMessage("error:score") + e.getMessage());
        }
    }
}
