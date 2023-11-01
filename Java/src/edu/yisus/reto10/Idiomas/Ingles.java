package edu.yisus.reto10.Idiomas;

import edu.yisus.reto10.operations.*;

import java.util.Scanner;

public class Ingles {

    public static void menuIngles () {
        /**
         * CREA UNA INSTANCIA DE SCANNER PARA LA ENTRADA DEL USUARIO
         */
        Scanner scanner = new Scanner(System.in);

        OperacionAritmetica operacion = null;
        char continuar = 'y';
        double num1 = 0, num2 = 0;
        int opcion;

        /**
         * SE AGREGA UN DO PARA QUE EL MENÚ PASE POR LO MENOS UNA VEZ, PERO EN ESTE CASO EL MENÚ ESTA EN INGLES
         */
        do {
            System.out.println("\tMenu");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Raised to nth power");
            System.out.println("6.Square root");
            System.out.println("7.Modulo Operation");
            System.out.println("8.Exit");

            opcion = scanner.nextInt();

            /**
             * SE AGREGA EL SWITCH POR CADA POSIBLE RESPUESTA QUE DE EL USUSARIO
             */
            switch (opcion) {
                case 1:
                    Scanner scannerSuma = new Scanner(System.in);

                    System.out.println("Insert first operand:");
                    num1 = scannerSuma.nextDouble();
                    System.out.println("Insert second operand:");
                    num2 = scannerSuma.nextDouble();

                    operacion = new Suma();
                    break;
                case 2:
                    Scanner scannerResta = new Scanner(System.in);

                    System.out.println("Insert first operand:");
                    num1 = scannerResta.nextDouble();
                    System.out.println("Insert second operand:");
                    num2 = scannerResta.nextDouble();

                    operacion = new Resta();
                    break;
                case 3:
                    Scanner scannerMultiplicacion = new Scanner(System.in);

                    System.out.println("insert the first multiple:");
                    num1 = scannerMultiplicacion.nextDouble();
                    System.out.println("insert the second multiple:");
                    num2 = scannerMultiplicacion.nextDouble();

                    operacion = new Multiplicacion();
                    break;
                case 4:
                    Scanner scannerDivision = new Scanner(System.in);

                    System.out.println("Insert the dividend:");
                    num1 = scannerDivision.nextDouble();
                    System.out.println("Insert the divisor:");
                    num2 = scannerDivision.nextDouble();

                    operacion = new Division();
                    break;
                case 5:
                    Scanner scannerPotencia = new Scanner(System.in);

                    System.out.println("Insert base operand:");
                    num1 = scannerPotencia.nextDouble();
                    System.out.println("Insert exponent:");
                    num2 = scannerPotencia.nextDouble();

                    operacion = new Potencia();
                    break;
                case 6:
                    Scanner scannerRaiz = new Scanner(System.in);

                    System.out.println("Insert the operator:");
                    num1 = scannerRaiz.nextDouble();

                    operacion = new RaizCuadrada();
                    break;
                case 7:
                    Scanner scannerModulo = new Scanner(System.in);

                    System.out.println("Insert the operator:");
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
            System.out.println("Result: " + resultado.getResultado());
            System.out.println("Do you want to perform another operation? (y/n): ");
            continuar = scanner.next().charAt(0);

        }while (continuar == 'y');
        scanner.close();
    }
}
