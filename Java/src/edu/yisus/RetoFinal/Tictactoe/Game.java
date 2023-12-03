package edu.yisus.RetoFinal.Tictactoe;
import edu.yisus.RetoFinal.UI.Languages.Languages;
import edu.yisus.RetoFinal.UI.Languages.LanguagesFactory;
import java.util.Scanner;

/**
 * LA CLASE `Game` REPRESENTA UN JUEGO DE TRES EN LÍNEA (TA-TE-TI).
 * INCLUYE MÉTODOS PARA JUGAR CONTRA LA COMPUTADORA O ENTRE DOS JUGADORES HUMANOS.
 */
public class Game {
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Board board;
    private ScoreBoard scoreBoard;
    private Scanner scanner;

    /**
     * CONSTRUYE UN NUEVO OBJETO `Game` PARA UN JUEGO DE TRES EN LÍNEA.
     * @param language   El idioma del juego (actualmente no utilizado).
     * @param scoreBoard El marcador de puntuación para llevar registro de los puntos de los jugadores.
     */
    public Game(Languages language, ScoreBoard scoreBoard) {
        this.board = new Board();
        this.scoreBoard = new ScoreBoard();
        this.scanner = new Scanner(System.in);
    }

    /**
     * INICIA UNA PARTIDA EN LA QUE UN JUGADOR HUMANO ENFRENTA A LA COMPUTADORA.
     * EL JUGADOR HUMANO USA 'X' Y LA COMPUTADORA USA 'O'.
     */
    public void playerVsComputer() {
        player1 = new Human("X");
        player2 = new IAplayer("O");
        player2.setName("Computadora");
        playGame();
    }

    /**
     * INICIA UNA PARTIDA EN LA QUE DOS JUGADORES HUMANOS COMPITEN ENTRE SÍ.
     * EL PRIMER JUGADOR USA 'X' Y EL SEGUNDO JUGADOR USA 'O'.
     */
    public void playerVsPlayer() {
        player1 = new Human("X");
        player2 = new Human("O");
        playGame();
    }

    /**
     * INICIA LA PARTIDA, GESTIONANDO LOS TURNOS Y CONTROLANDO EL DESARROLLO DEL JUEGO.
     */
    public void playGame() {
        currentPlayer = player1;

        while (!board.isGameOver()) {
            board.displayBoard();
            int move = currentPlayer.makeMove();

            if (!board.isMoveValid(move)) {
                System.out.println(LanguagesFactory.getMessage("invalid_move"));
                continue;
            }

            board.makeMove(move, currentPlayer.getSymbol());

            if (board.checkForWinner()) {
                currentPlayer.setScore(currentPlayer.getScore() + 1);
                scoreBoard.updateScore(currentPlayer);
                System.out.println(currentPlayer.getName() + LanguagesFactory.getMessage("you_have") + currentPlayer.getScore() + LanguagesFactory.getMessage("points"));
                return;
            }

            if (board.isBoardFull()) {
                System.out.println(LanguagesFactory.getMessage("tie"));
                System.out.println(player1.getName() + LanguagesFactory.getMessage("you_have") + player1.getScore() + LanguagesFactory.getMessage("points"));
                System.out.println(player2.getName() + LanguagesFactory.getMessage("you_have") + player2.getScore() + LanguagesFactory.getMessage("points"));
                return;
            }

            scoreBoard.updateScore(player1);
            scoreBoard.updateScore(player2);

            scoreBoard.displayRankings();

            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }
    }
}