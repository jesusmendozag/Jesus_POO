package edu.yisus.reto10.UI;
import edu.yisus.reto10.Idiomas.Español;
import edu.yisus.reto10.Idiomas.Ingles;
import edu.yisus.reto10.Idiomas.Japones;

import java.util.Scanner;

public class CLI {
    public static void menu () {
        /**
         * CREA UNA INSTANCIA DE SCANNER PARA LA ENTRADA DEL USUARIO
         */
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            /**
             * MUESTRA EL MENSAJE PARA QUE EL USUARIO SELECCIONE UN IDIOMA
             */
            System.out.println("\tSelect the lenguage");
            System.out.println("1.English");
            System.out.println("2.Spanish");
            System.out.println("3.Japanese");
            System.out.println("4.Exit");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Ingles.menuIngles();
                    break;
                case 2:
                    Español.menuEspañol();
                    break;
                case 3:
                    Japones.menuJapones();
                    break;
                case 4:
                    break;
            }

            /**
             * EL BUCLE CONTINUARÁ HASTA QUE EL USUARIO SELECCIONE LA OPCIÓN 4 (SALIR)
             */
        }while (opcion != 4);
        scanner.close();
    }
}
