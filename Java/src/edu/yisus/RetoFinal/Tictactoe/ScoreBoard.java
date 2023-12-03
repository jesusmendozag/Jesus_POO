package edu.yisus.RetoFinal.Tictactoe;
import java.io.*;
import java.util.*;

/**
 * LA CLASE `ScoreBoard` REPRESENTA UN TABLERO DE PUNTUACIONES EN EL JUEGO DE TRES EN LÍNEA
 * GESTIONA LAS PUNTUACIONES DE LOS JUGADORES, LAS ACTUALIZA, LAS GUARDA EN UN ARCHIVO Y LAS MUESTRA.
 */
public class ScoreBoard {
    private static final String SCORES_FILE = "scores.txt";
    private List<Player> players;

    /**
     * CONSTRUYE UN NUEVO OBJETO `ScoreBoard` E INICIALIZA LA LISTA DE JUGADORES CARGANDO LAS PUNTUACIONES DESDE UN ARCHIVO.
     */
    public ScoreBoard() {
        players = new ArrayList<>();
        loadScoresFromFile();
    }

    /**
     * ACTUALIZA LA PUNTUACIÓN DE UN JUGADOR EN EL TABLERO DE PUNTUACIONES.
     * SI EL JUGADOR NO ESTÁ EN LA LISTA, SE AGREGA.
     * @param player El jugador cuya puntuación se actualizará.
     */
    public void updateScore(Player player) {
        if (!players.contains(player)) {
            players.add(player);
        }
    }

    /**
     * OBTIENE LA LISTA DE JUGADORES ORDENADA POR PUNTUACIÓN EN ORDEN DESCENDENTE.
     * @return La lista de jugadores ordenada por puntuación.
     */
    public List<Player> getRankedPlayers() {
        players.sort(Comparator.comparingInt(Player::getScore).reversed());
        return players;
    }

    /**
     * GUARDA LAS PUNTUACIONES DE LOS JUGADORES EN UN ARCHIVO.
     */
    public void saveScoresToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(SCORES_FILE))) {
            for (Player player : players) {
                writer.println(player.getName() + ": " + player.getScore());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * CARGA LAS PUNTUACIONES DE LOS JUGADORES DESDE UN ARCHIVO.
     */
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

    /**
     * MUESTRA LOS RANKINGS DE LOS JUGADORES (IGNORA EL JUGADOR DE LA COMPUTADORA EN LA VISUALIZACIÓN).
     */
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