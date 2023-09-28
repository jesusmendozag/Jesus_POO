package src.edu.yisus.reto3.UI;

import src.edu.yisus.reto3.process.converter;

import java.util.Scanner;

public class CLI {
    public  static void showMenu () {
        /*
        Se agrega un scanner para que la computadora pueda leer la informacón que el usuario
        proporcionará
         */
        Scanner scanner = new Scanner(System.in);
        char opcion;
        /*
        Se agrega un do para poder mostrar el menú de la aplicación, esto para que le usuario
        si o si tenga que interactuar con la aplicación
         */
        do {
            System.out.println("\tMenú de conversiones:");
            System.out.println("A.Convertir de decimal a binario");
            System.out.println("B.Convertir de decimal a octal");
            System.out.println("C.Convertir de decimal a hexadecimal");
            System.out.println("D.Convertir de binario a decimal");
            System.out.println("E.Convertir de octal a decimal");
            System.out.println("F.Convertir de hexadecimal a decimal");

            System.out.print("Opción: ");
            opcion = scanner.next().charAt(0);
            /*
            Se agrega un switch para que el usuario pueda darle una opción a la computadora y
            así la computadora sabrá que conversión tiene que hacer
             */
            switch (opcion) {
                case 'a', 'A':
                    converter.convertDecimalBinary();
                    break;

                case 'b', 'B':
                    converter.convertDecimalToOctal();
                    break;

                case 'c', 'C':
                    converter.convertDecimalHexadecimal();
                    break;

                case 'd', 'D':
                    converter.convertBinaryToDecimal();
                    break;

                case 'e', 'E':
                    converter.convertOctalADecimal();
                    break;

                case 'f', 'F':
                    converter.convertHexadecimalToDecimal();
                    break;
            }
            System.out.print("¿Deseas realizar otra conversión? (s/n): ");
            opcion = scanner.next().charAt(0);

        } while (opcion == 's');
        scanner.close();
    }
}
