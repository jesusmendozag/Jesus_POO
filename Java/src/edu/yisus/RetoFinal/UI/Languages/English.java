package edu.yisus.RetoFinal.UI.Languages;

public class English implements Languages {
    @Override
    public String getMessage(String key) {
        switch (key) {
            case "welcome":
                return "\t¡Welcome to Tic Tac Toe game!";
            case "select_option":
                return "Select one of the following option";
            case "menu":
                return "\tMenu\n1.Player VS Computer\n2.Player VS PLayer\n3.Show ScoreBoard\n4.Exit";
            case "exit":
                return "Quitting the game. Goodbye!";
            case "error_choice":
                return "Invalid choice. Exiting the game.";
            case "invalid_move":
                return "Invalid move. Try again.";
            case "player":
                return "Player";
            case "win":
                return "wins!";
            case "tie":
                return "The game is a tie!";
            case "human_move":
                return "Enter your move (1-9): ";
            case "name":
                return "Enter your name";
            case "error_score":
                return "An error occurred while saving scores.";
            case "replay":
                return "Do you want to play again? (s/n): ";
            case "you_have":
                return " you have ";
            case "points":
                return " points";
            case "error":
                return "Choice a number please";
            default:
                return "Message not found";
        }
    }
}