package edu.yisus.RetoFinal.Tictactoe;
import edu.yisus.RetoFinal.UI.Languages.Languages;
import edu.yisus.RetoFinal.UI.Languages.LanguagesFactory;

public class Game {
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Board board;
    private ScoreBoard scoreBoard;

    public Game(Languages language, ScoreBoard scoreBoard) {
        this.board = new Board();
        this.scoreBoard = new ScoreBoard();
    }

    public void playerVsComputer() {
        player1 = new Human("X");
        player2 = new IAplayer("O");
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
                board.displayBoard();
                System.out.println(currentPlayer.getName() + " " + LanguagesFactory.getMessage("win"));
                scoreBoard.addScore(currentPlayer.getName(), 1);
                return;
            }

            if (board.isBoardFull()) {
                board.displayBoard();
                System.out.println(LanguagesFactory.getMessage("tie"));
                return;
            }

            scoreBoard.addScore(player1.getName(), 1);
            scoreBoard.addScore(player1.getName(), 1);

            scoreBoard.printScores();

            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }
    }

}