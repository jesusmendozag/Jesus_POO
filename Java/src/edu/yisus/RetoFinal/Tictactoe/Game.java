package edu.yisus.RetoFinal.Tictactoe;
import edu.yisus.RetoFinal.UI.Languages.Languages;
import edu.yisus.RetoFinal.UI.Languages.LanguagesFactory;
import java.util.Scanner;

public class Game {
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Board board;
    private ScoreBoard scoreBoard;
    private Scanner scanner;

    public Game(Languages language, ScoreBoard scoreBoard) {
        this.board = new Board();
        this.scoreBoard = new ScoreBoard();
        this.scanner = new Scanner(System.in);
    }

    public void playerVsComputer() {
        player1 = new Human("X");
        player2 = new IAplayer("O");
        player2.setName("Computadora");
        playGame();
    }

    public void playerVsPlayer() {
        player1 = new Human("X");
        player2 = new Human("O");
        playGame();
    }

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