package edu.yisus.reto10.Idiomas;

import edu.yisus.reto10.operations.*;

import java.util.Scanner;

public class Español {
    public static void menuEspañol () {
        /**
         * CREA UNA INSTANCIA DE SCANNER PARA LA ENTRADA DEL USUARIO
         */
        Scanner scanner = new Scanner(System.in);

        OperacionAritmetica operacion = null;
        char continuar = 's';
        double num1 = 0, num2 = 0;
        int opcion;

        /**
         * SE AGREGA UN DO PARA QUE EL MENÚ PASE POR LO MENOS UNA VEZ, PERO EN ESTE CASO EL MENÚ ESTA EN ESPAÑOL
         */
        do {
            System.out.println("\tMenú");
            System.out.println("1.Suma");
            System.out.println("2.Resta");
            System.out.println("3.Multiplicación");
            System.out.println("4.División");
            System.out.println("5.Potencia");
            System.out.println("6.Raíz");
            System.out.println("7.Modulo");
            System.out.println("8.Salir");

            opcion = scanner.nextInt();

            /**
             * SE AGREGA EL SWITCH POR CADA POSIBLE RESPUESTA QUE DE EL USUSARIO
             */
            switch (opcion) {
                case 1:
                    Scanner scannerSuma = new Scanner(System.in);

                    System.out.println("Ingresa el primero operando:");
                    num1 = scannerSuma.nextDouble();
                    System.out.println("Ingrese el segundo operando:");
                    num2 = scannerSuma.nextDouble();

                    operacion = new Suma();
                    break;
                case 2:
                    Scanner scannerResta = new Scanner(System.in);

                    System.out.println("Ingresa el primero operando:");
                    num1 = scannerResta.nextDouble();
                    System.out.println("Ingrese el segundo operando:");
                    num2 = scannerResta.nextDouble();

                    operacion = new Resta();
                    break;
                case 3:
                    Scanner scannerMultiplicacion = new Scanner(System.in);

                    System.out.println("Ingresa el primero multiplo:");
                    num1 = scannerMultiplicacion.nextDouble();
                    System.out.println("Ingrese el segundo multiplo:");
                    num2 = scannerMultiplicacion.nextDouble();

                    operacion = new Multiplicacion();
                    break;
                case 4:
                    Scanner scannerDivision = new Scanner(System.in);

                    System.out.println("Ingresa el dividendo:");
                    num1 = scannerDivision.nextDouble();
                    System.out.println("Ingrese el divisor:");
                    num2 = scannerDivision.nextDouble();

                    operacion = new Division();
                    break;
                case 5:
                    Scanner scannerPotencia = new Scanner(System.in);

                    System.out.println("Ingresa el operando base:");
                    num1 = scannerPotencia.nextDouble();
                    System.out.println("Ingrese el exponente:");
                    num2 = scannerPotencia.nextDouble();

                    operacion = new Potencia();
                    break;
                case 6:
                    Scanner scannerRaiz = new Scanner(System.in);

                    System.out.println("Ingresa el operador:");
                    num1 = scannerRaiz.nextDouble();

                    operacion = new RaizCuadrada();
                    break;
                case 7:
                    Scanner scannerModulo = new Scanner(System.in);

                    System.out.println("Ingresa el operador:");
                    num1 = scannerModulo.nextDouble();

                    operacion = new Modulo();
                    break;
                case 8:
                    return;
            }

            Resultado resultado = new Resultado(operacion, num1, num2);

            /**
             * AQUÍ SIMPLEMENTE MANDAMOS A LLAMAR EL RESULTADO DE LAS OPERACIONES Y LE AGREGAMOS UNA OPCIÓN POR SI EL USUSARIO QUIERE SEGUIR
             * UTILIZANDO EL PROGRAMA
             */
            System.out.println(resultado.getOperacion());
            System.out.println("Resultado: " + resultado.getResultado());
            System.out.println("¿Desea realizar otra operación? (s/n): ");
            continuar = scanner.next().charAt(0);

        }while (continuar == 's' || continuar == 'n');
        scanner.close();
    }
}
