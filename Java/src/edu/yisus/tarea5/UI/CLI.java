package edu.yisus.tarea5.UI;
import java.util.Scanner;
import edu.yisus.tarea5.process.GameGenerator;

public class CLI {
    public GameGenerator game;

    public CLI() {
        this.game = null;
    }
    /**
    EL MODULO SIRVE PARA SIMPLEMENTE MOSTRAR EL MENÚ DE LO QUE SERÍA EL MINI VIDEOJUEGO
    EN DONDE TAMBIÉN SALE UN MENSAJE EN DADO CASO DE NO SELLECIONAR UN NIVEL
     */
    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t¡Bienvenido al juego de adivinanza de palabras!");
        while (true) {
            System.out.print("\nElige un nivel (easy/intermediate/advanced)" +
                    " o presiona 0 para salir: ");
            String level = scanner.nextLine().toLowerCase();
            /**
             AQUI SE AGREGA UNA EXCEPCIÓN PARA QUE AL MOMENTO DE PONER 0 SE CIERRE EL
             PROGRAMA Y APAREZCA UN MENSAJE Y QUE EN DADO CASO DE QUE ESCRIBA UN NIVEL
             QUE NO ESTE, SALGA OTRO MENSAJE EL CUAL LE INDIQUE AL USUARIO QUE NO ES
             VÁLIDO
             */
            try {
                if (level.equals("0")) {
                    System.out.println("Gracias por jugar. ¡Hasta luego!");
                    break;
                }

                if (!level.equals("easy") && !level.equals("intermediate") && !level.equals("advanced")) {
                    throw new IllegalArgumentException("Nivel no válido. Elige un nivel válido o presiona 0 para salir.");
                }
                game = new GameGenerator(level);
                System.out.println("Comienza a adivinar la palabra:");
                playGame(scanner);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        scanner.close();
    }

    /**
    UN MODULO PARA QUE EL JUGADOR PUEDA VISUALIZAR LA LETRA QUE VA A PONER EL JUGADOR
    Y SALDRÁ UN MENSAJE CUANDO NO SEA UNA LETRA O DOS LETRAS AL MIMSO TIEMPO
     */
    public void playGame(Scanner scanner) {
        while (!game.gameOver()) {
            System.out.println("Palabra actual: " + game.getDisplayWord());
            System.out.print("Introduce una letra (o presiona 0 para salir): ");
            String input = scanner.nextLine();
            /**
             AQUÍ NUEVAMENTE SE AGREGA UNA EXCEPCIÓN PARA EN EL MOMENTO EN QUE EL USUARIO
             YA SE ENCUENTRE JUGANDO Y QUIERA ESCRIBIR ALGÚN NÚMERO O MÁS DE UNA LETRA AL
             MISMO TIEMPO
             */
            try {
                if (input.equals("0")) {
                    System.out.println("¡Hasta luego!");
                    break;
                }

                if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                    throw new IllegalArgumentException("Entrada no válida. Debes ingresar una sola letra o presionar 0 para salir.");
                }

                char guess = input.charAt(0);
                boolean correctGuess = game.guess(guess);

                if (correctGuess) {
                    System.out.println("¡Adivinaste una letra!");
                } else {
                    System.out.println("Esa letra no está en la palabra. Intentos restantes: " + game.remainingAttempts);
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        if (game.gameOver() && game.getDisplayWord().equals(game.getDisplayWord())) {
            System.out.println("¡Felicidades! Adivinaste la palabra: " + game.getDisplayWord());
        } else {
            System.out.println("Se acabaron los intentos. La palabra era: " + game.getDisplayWord());
        }
    }

}