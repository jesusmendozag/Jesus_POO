package edu.yisus.RetoFinal.Tictactoe;
import java.io.*;
import java.util.*;

public class ScoreBoard {
    private static final String SCORES_FILE = "scores.txt";
    private List<Player> players;

    public ScoreBoard() {
        players = new ArrayList<>();
        loadScoresFromFile();
    }

    public void updateScore(Player player) {
        if (!players.contains(player)) {
            players.add(player);
        }
    }

    public List<Player> getRankedPlayers() {
        players.sort(Comparator.comparingInt(Player::getScore).reversed());
        return players;
    }

    public void saveScoresToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(SCORES_FILE))) {
            for (Player player : players) {
                writer.println(player.getName() + ": " + player.getScore());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadScoresFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(SCORES_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(": ");
                if (parts.length == 2) {
                    String playerName = parts[0];
                    int score = Integer.parseInt(parts[1]);
                    Player player = new GenericPlayer("-");
                    player.setName(playerName);
                    player.setScore(score);
                    players.add(player);
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public void displayRankings() {
        List<Player> rankedPlayers = getRankedPlayers();
        System.out.println("Rankings:");
        for (int i = 0; i < rankedPlayers.size(); i++) {
            Player player = rankedPlayers.get(i);
            if (!player.getName().equals("Computadora")) {
                System.out.println((i + 1) + ": " + player.getName());
            }
        }
    }
}