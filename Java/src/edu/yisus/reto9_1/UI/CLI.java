package edu.yisus.reto9_1.UI;
import java.util.Scanner;
import edu.yisus.reto9_1.process.Pelota;

public class CLI {
    public static void CLI (String[] args) {
        Scanner scanner = new Scanner(System.in);

        /**
         * Interacción con el usuario para crear una pelota
         */
        System.out.println("Creación de una Pelota:");
        System.out.print("Ingrese el color de la pelota: ");
        String color = scanner.nextLine();

        System.out.print("Ingrese la rapidez inicial de la pelota: ");
        int rapidez = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese el poder inicial de la pelota: ");
        int poder = Integer.parseInt(scanner.nextLine());

        /**
         * Crear una instancia de la clase Pelota con los datos ingresados
         */
        Pelota miPelota = new Pelota(color, rapidez, poder);

        System.out.println("Pelota creada con color: " + miPelota.getColor() + ", rapidez: " + miPelota.getRapidez() + ", poder: " + miPelota.getPoder());

        // Realizar acciones en la pelota
        miPelota.disminuirRapidez();
        miPelota.aumentarPoder();

        System.out.println("Pelota después de las acciones: color " + miPelota.getColor() + ", rapidez " + miPelota.getRapidez() + ", poder " + miPelota.getPoder());

        scanner.close();
    }
}
