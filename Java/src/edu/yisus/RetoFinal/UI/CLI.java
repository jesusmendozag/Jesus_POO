package edu.yisus.RetoFinal.UI;
import edu.yisus.RetoFinal.UI.Languages.*;
import edu.yisus.RetoFinal.Tictactoe.Game;
import edu.yisus.RetoFinal.Tictactoe.ScoreBoard;
import java.util.Scanner;

public class CLI {
    private static Languages language;
    private static ScoreBoard scoreBoard = new ScoreBoard();

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        char continuar = 's';


        /**
         * MENÚ PARA PODER SELECCIONAR UN IDIOMA.
         */
        System.out.println("Select the language:");
        System.out.println("1. English");
        System.out.println("2. Español");
        System.out.println("3. 日本語 ");

        int idiomaSeleccionado = scanner.nextInt();

        /**
         * CONFIGURACIÓN PARA PODER CAMBIAR LOS MENSAJES AL IDIOMA SELECCIONADO.
         */

        LanguagesFactory.selectLanguage(idiomaSeleccionado);

        do {
            System.out.println(LanguagesFactory.getMessage("welcome"));
            System.out.println(LanguagesFactory.getMessage("menu"));
            System.out.println(LanguagesFactory.getMessage("select_option"));

            int opcion = scanner.nextInt();

            if (opcion == 0) {
                break;
            }

            if (opcion < 1 || opcion > 4) {
                System.out.println(LanguagesFactory.getMessage("error_choice"));
                continue;
            }

            switch (opcion) {
                case 1:
                    playerVsComputer();
                    break;
                case 2:
                    playerVsPlayer();
                    break;
                case 3:
                    scoreBoard.printScores();
                    scoreBoard.saveScoresToFile("score.txt");
                    break;
                case 4:
                    System.out.println(LanguagesFactory.getMessage("exit"));
                    return;
            }
        } while (true);

    }

    private static void playerVsPlayer() {
        Scanner scanner = new Scanner(System.in);
        char replay;
        do {
            Game game = new Game(language, scoreBoard);
            game.playerVsPlayer();

            System.out.println(LanguagesFactory.getMessage("replay"));
            replay = scanner.next().charAt(0);
        } while (replay == 's' || replay == 'S');
    }

    private static void playerVsComputer() {
        Scanner scanner = new Scanner(System.in);
        char replay;

        do {
            Game game = new Game(language, scoreBoard);
            game.playerVsComputer();

            System.out.println(LanguagesFactory.getMessage("replay"));
            replay = scanner.next().charAt(0);
        } while (replay == 's' || replay == 'S');
    }
}