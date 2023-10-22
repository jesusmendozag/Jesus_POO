package edu.yisus.reto9_2.UI;
import edu.yisus.reto9_2.process.Ayudante;
import java.util.Scanner;

public class CLI {
    /**
     * Método para crear y mostrar los Ayudantes
     */
    public static void CreateAyudantes() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Creación de Ayudantes:");
        // Creamos un arreglo para almacenar los ayudantes
        Ayudante[] ayudantes = new Ayudante[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del ayudante " + (i + 1) + ":");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese el número de ojos (1 o 2):");
            int numeroDeOjos = Integer.parseInt(scanner.nextLine());

            System.out.println("Ingrese el color de piel (amarilla o morada):");
            String colorDePiel = scanner.nextLine();

            System.out.println("Ingrese la altura (mediano o alto):");
            String altura = scanner.nextLine();

            System.out.println("Ingrese el nivel de creación (1-5):");
            int nivelCreacion = Integer.parseInt(scanner.nextLine());

            System.out.println("Ingrese el nivel de arreglo (1-5):");
            int nivelArreglo = Integer.parseInt(scanner.nextLine());

            System.out.println("Ingrese el nivel destructivo (1-5):");
            int nivelDestructivo = Integer.parseInt(scanner.nextLine());

            ayudantes[i] = new Ayudante(nombre, numeroDeOjos, colorDePiel, altura, nivelCreacion, nivelArreglo, nivelDestructivo);
        }

        // Presentar a los ayudantes
        System.out.println("Los ayudantes son:");
        for (Ayudante ayudante : ayudantes) {
            System.out.println(ayudante.toString());
        }

        scanner.close();
    }
}
