package edu.yisus.RetoFinal.Tictactoe;
import edu.yisus.RetoFinal.Languages.Languages;
import java.util.Scanner;


public class Game {
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Board board;
    private Languages language;

    public Game(Languages language) {
        this.language = language;
        this.board = new Board();
    }

    public void startGame() {
        System.out.println(language.getTranslation("menu.playAgainstComputer"));
        System.out.println(language.getTranslation("menu.playAgainstPlayer"));
        System.out.println(language.getTranslation("menu.quit"));

        System.out.print(language.getTranslation("prompt.enterChoice"));
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                playerVsComputer();
                break;
            case 2:
                playerVsPlayer();
                break;
            case 3:
                System.out.println("Quitting the game. Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Exiting the game.");
                System.exit(0);
        }
    }

    private void playerVsComputer() {
        player1 = new Human("X");
        player2 = new IAplayer("O");
        playGame();
    }

    private void playerVsPlayer() {
        player1 = new Human("X");
        player2 = new Human("O");
        playGame();
    }

    private void playGame() {
        currentPlayer = player1;

        while (!board.isGameOver()) {
            board.displayBoard();
            int move = currentPlayer.makeMove();

            if (!board.isMoveValid(move)) {
                System.out.println("Invalid move. Try again.");
                continue;
            }

            board.makeMove(move, currentPlayer.getSymbol());

            if (board.checkForWinner()) {
                board.displayBoard();
                System.out.println("Player " + currentPlayer.getSymbol() + " wins!");
                return;
            }

            if (board.isBoardFull()) {
                board.displayBoard();
                System.out.println("The game is a tie!");
                return;
            }

            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }
    }
}