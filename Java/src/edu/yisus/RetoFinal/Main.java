package edu.yisus.RetoFinal;
import edu.yisus.RetoFinal.Languages.Languages;
import edu.yisus.RetoFinal.Tictactoe.Game;
import static edu.yisus.RetoFinal.UI.CLI.selectLanguage;

public class Main {
    public static void main(String[] args) {
        Languages languages = selectLanguage();
        Game game = new Game(languages);
        game.startGame();
    }
}
