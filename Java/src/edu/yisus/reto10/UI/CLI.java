package edu.yisus.reto10.UI;
import edu.yisus.reto10.Idiomas.LanguageFactory;
import edu.yisus.reto10.operations.*;
import edu.yisus.reto10.operations.Resultado;
import java.util.Scanner;

public class CLI {
    /**
     * EJECUTA LA CALCULADORA INTERACTIVA QUE PERMITE AL USUARIO SELECCIONAR UN IDIOMA Y PODER REALIZAR OPERACIONES ARITMETICAS.
     */
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        char continuar = 's';
        double num1 = 0, num2 = 0;

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

        LanguageFactory.selectLanguage(idiomaSeleccionado);

        do {
            System.out.println(LanguageFactory.getMessage("welcome"));
            System.out.println(LanguageFactory.getMessage("menu"));
            System.out.println(LanguageFactory.getMessage("choice_option"));

            int opcion = scanner.nextInt();

            if (opcion == 0) {
                break;
            }

            if (opcion < 1 || opcion > 9) {
                System.out.println(LanguageFactory.getMessage("invalid_option"));
                continue;
            }

            OperacionAritmetica operacion = null;

            switch (opcion) {
                case 1:
                    operacion = new Suma();
                    System.out.print(LanguageFactory.getMessage("enter_first_operand"));
                    num1 = scanner.nextDouble();
                    System.out.print(LanguageFactory.getMessage("enter_second_operand"));
                    num2 = scanner.nextDouble();
                    break;
                case 2:
                    operacion = new Resta();
                    System.out.print(LanguageFactory.getMessage("enter_first_operand"));
                    num1 = scanner.nextDouble();
                    System.out.print(LanguageFactory.getMessage("enter_second_operand"));
                    num2 = scanner.nextDouble();
                    break;
                case 3:
                    operacion = new Multiplicacion();
                    System.out.print(LanguageFactory.getMessage("enter_first_multiple"));
                    num1 = scanner.nextDouble();
                    System.out.print(LanguageFactory.getMessage("enter_second_multiple"));
                    num2 = scanner.nextDouble();
                    break;
                case 4:
                    operacion = new Division();
                    System.out.print(LanguageFactory.getMessage("enter_dividend"));
                    num1 = scanner.nextDouble();
                    System.out.print(LanguageFactory.getMessage("enter_divisor"));
                    num2 = scanner.nextDouble();
                    break;
                case 5:
                    operacion = new Potencia();
                    System.out.print(LanguageFactory.getMessage("enter_base_power"));
                    num1 = scanner.nextDouble();
                    System.out.print(LanguageFactory.getMessage("enter_exponent"));
                    num2 = scanner.nextDouble();
                    break;
                case 6:
                    operacion = new RaizCuadrada();
                    System.out.print(LanguageFactory.getMessage("enter_base"));
                    num1 = scanner.nextDouble();
                    System.out.println(LanguageFactory.getMessage("enter_raiz"));
                    num2 = scanner.nextDouble();
                    break;
                case 7:
                    operacion = new Logaritmo();
                    System.out.print(LanguageFactory.getMessage("enter_logarithm_number"));
                    num1 = scanner.nextDouble();
                    System.out.print(LanguageFactory.getMessage("enter_logarithm_base"));
                    num2 = scanner.nextDouble();
                    break;
                case 8:
                    operacion = new Modulo();
                    System.out.print(LanguageFactory.getMessage("enter_modulo_number"));
                    num1 = scanner.nextDouble();
                    System.out.print(LanguageFactory.getMessage("enter_modulo_divisor"));
                    num2 = scanner.nextDouble();
                    break;
                case 9:
                    System.out.println(LanguageFactory.getMessage("exit_menu"));
                    return;
            }

            Resultado resultado = new Resultado(operacion, num1, num2);

            System.out.print(LanguageFactory.getMessage("description_operation"));
            System.out.println(resultado.obtenerResultado());
            System.out.println(LanguageFactory.getMessage("result") + resultado.obtenerMensaje());

            resultado = new Resultado(operacion, num1, num2);

            System.out.print(LanguageFactory.getMessage("continue"));
            continuar = scanner.next().charAt(0);

        } while (continuar == 'y' || continuar == 'o');

        scanner.close();
    }
}