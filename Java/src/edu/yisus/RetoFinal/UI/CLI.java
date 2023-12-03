package edu.yisus.RetoFinal.UI;
import edu.yisus.RetoFinal.UI.Languages.*;
import edu.yisus.RetoFinal.Tictactoe.Game;
import edu.yisus.RetoFinal.Tictactoe.ScoreBoard;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * LA CLASE `CLI` REPRESENTA LA INTERFAZ DE LÍNEA DE COMANDOS (CLI) PARA INTERACTUAR CON EL JUEGO DE TRES EN LÍNEA.
 * PERMITE SELECCIONAR UN IDIOMA, ACCEDER A DIFERENTES OPCIONES DE JUEGO Y VISUALIZAR LOS RANKINGS DE JUGADORES.
 */
public class CLI {
    private static Languages language;
    private static ScoreBoard scoreBoard = new ScoreBoard();

    /**
     * MÉTODO PRINCIPAL QUE MUESTRA EL MENÚ PRINCIPAL Y FACILITA LA INTERACCIÓN CON EL JUEGO.
     */
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

        try {
            int idiomaSeleccionado = scanner.nextInt();

            /**
             * CONFIGURACIÓN PARA PODER CAMBIAR LOS MENSAJES AL IDIOMA SELECCIONADO.
             */
            LanguagesFactory.selectLanguage(idiomaSeleccionado);

        }catch (InputMismatchException e) {
            System.out.println(LanguagesFactory.getMessage("error_choice"));
            scanner.next();
        }

        do {
            System.out.println(LanguagesFactory.getMessage("welcome"));
            System.out.println(LanguagesFactory.getMessage("menu"));
            System.out.println(LanguagesFactory.getMessage("select_option"));

            try{
                int opcion = scanner.nextInt();

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
                        scoreBoard.displayRankings();
                        scoreBoard.saveScoresToFile();
                        break;
                    case 4:
                        System.out.println(LanguagesFactory.getMessage("exit"));
                        return;
                }
            }catch (InputMismatchException e){
                System.out.println(LanguagesFactory.getMessage("error_choice"));
                scanner.next();
            }
        } while (true);

    }

    /**
     * INICIA UNA PARTIDA ENTRE DOS JUGADORES HUMANOS.
     */
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

    /**
     * INICIA UNA PARTIDA DONDE UN JUGADOR HUMANO ENFRENTA A LA COMPUTADORA.
     */
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