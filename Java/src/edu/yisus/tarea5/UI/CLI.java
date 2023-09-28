package edu.yisus.tarea5.UI;
import java.util.Scanner;
import edu.yisus.tarea5.process.GameGenerator;

public class CLI {
    public GameGenerator game;

    public CLI() {
        this.game = null;
    }
    /*
    EL MODULO SIRVE PARA SIMPLEMENTE MOSTRAR EL MENÚ DE LO QUE SERÍA EL MINI VIDEOJUEGO
    EN DONDE TAMBIÉN SALE UN MENSAJE EN DADO CASO DE NO SELLECIONAR UN NIVEL
     */
    public void StartGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t¡Bienvenido al juego de adivinanza de palabras!");
        while (true) {
            System.out.print("\nPor favor, elige un nivel (easy/intermediate/advanced) o presiona 0 para salir: ");
            String level = scanner.nextLine().toLowerCase();
            if (level.equals("0")) {
                System.out.println("Gracias por jugar. ¡Hasta luego!");
                break;
            }
            if (!level.equals("easy") && !level.equals("intermediate") && !level.equals("advanced")) {
                System.out.println("Nivel no válido. Por favor, elige un nivel válido.");
                continue;
            }
            game = new GameGenerator(level);
            System.out.println("Comienza a adivinar la palabra:");
            PlayGame(scanner);
        }
        scanner.close();
    }
    /*
    UN MODULO PARA QUE EL JUGADOR PUEDA VISUALIZAR LA LETRA QUE VA A PONER EL JUGADOR
    Y SALDRÁ UN MENSAJE CUANDO NO SEA UNA LETRA O DOS LETRAS AL MIMSO TIEMPO
     */
    public void PlayGame(Scanner scanner) {
        while (!game.GameOver()) {
            System.out.println("Palabra actual: " + game.GetDisplayWord());
            System.out.print("Introduce una letra: ");
            String input = scanner.nextLine();
            if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                System.out.println("Entrada no válida. Debes ingresar una sola letra.");
                continue;
            }
            char guess = input.charAt(0);
            boolean correctGuess = game.Guess(guess);
            if (correctGuess) {
                System.out.println("¡Adivinaste una letra!");
            } else {
                System.out.println("Esa letra no está en la palabra. Intentos restantes: " + game.remainingAttempts);
            }
        }
        if (game.GameOver() && game.GetDisplayWord().equals(game.GetDisplayWord())) {
            System.out.println("¡Felicidades! Adivinaste la palabra: " + game.GetDisplayWord());
        } else {
            System.out.println("Se acabaron los intentos. La palabra era: " + game.GetDisplayWord());
        }
    }
}