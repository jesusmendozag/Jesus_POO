package edu.yisus.reto10.Idiomas;

import edu.yisus.reto10.operations.*;

import java.util.Scanner;

public class Japones {
    public static void menuJapones () {
        /**
         * CREA UNA INSTANCIA DE SCANNER PARA LA ENTRADA DEL USUARIO
         */
        Scanner scanner = new Scanner(System.in);

        OperacionAritmetica operacion = null;
        char continuar = 'y';
        double num1 = 0, num2 = 0;
        int opcion;

        /**
         * SE AGREGA UN DO PARA QUE EL MENÚ PASE POR LO MENOS UNA VEZ, PERO EN ESTE CASO EL MENÚ ESTA EN JAPONES
         */
        do {
            System.out.println("\tメニュー");
            System.out.println("一.追加");
            System.out.println("二.引き算");
            System.out.println("三.乗算");
            System.out.println("四.分割");
            System.out.println("五.n乗");
            System.out.println("六.平方根");
            System.out.println("七.モジュロ演算");
            System.out.println("八.出口");

            opcion = scanner.nextInt();

            /**
             * SE AGREGA EL SWITCH POR CADA POSIBLE RESPUESTA QUE DE EL USUSARIO
             */
            switch (opcion) {
                case 1:
                    Scanner scannerSuma = new Scanner(System.in);

                    System.out.println("最初のオペランドを挿入:");
                    num1 = scannerSuma.nextDouble();
                    System.out.println("2 番目のオペランドを挿入:");
                    num2 = scannerSuma.nextDouble();

                    operacion = new Suma();
                    break;
                case 2:
                    Scanner scannerResta = new Scanner(System.in);

                    System.out.println("最初のオペランドを挿入:");
                    num1 = scannerResta.nextDouble();
                    System.out.println("2 番目のオペランドを挿入:");
                    num2 = scannerResta.nextDouble();

                    operacion = new Resta();
                    break;
                case 3:
                    Scanner scannerMultiplicacion = new Scanner(System.in);

                    System.out.println("最初の複数を挿入:");
                    num1 = scannerMultiplicacion.nextDouble();
                    System.out.println("2 番目の倍数を挿入します:");
                    num2 = scannerMultiplicacion.nextDouble();

                    operacion = new Multiplicacion();
                    break;
                case 4:
                    Scanner scannerDivision = new Scanner(System.in);

                    System.out.println("配当金を入れる:");
                    num1 = scannerDivision.nextDouble();
                    System.out.println("除数を挿入します:");
                    num2 = scannerDivision.nextDouble();

                    operacion = new Division();
                    break;
                case 5:
                    Scanner scannerPotencia = new Scanner(System.in);

                    System.out.println("ベースオペランドを挿入:");
                    num1 = scannerPotencia.nextDouble();
                    System.out.println("指数の挿入:");
                    num2 = scannerPotencia.nextDouble();

                    operacion = new Potencia();
                    break;
                case 6:
                    Scanner scannerRaiz = new Scanner(System.in);

                    System.out.println("演算子を挿入する:");
                    num1 = scannerRaiz.nextDouble();

                    operacion = new RaizCuadrada();
                    break;
                case 7:
                    Scanner scannerModulo = new Scanner(System.in);

                    System.out.println("演算子を挿入する:");
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
            System.out.println("結果: " + resultado.getResultado());
            System.out.println("別の操作を実行しますか? (y/n): ");
            continuar = scanner.next().charAt(0);

        }while (continuar == 'y');
        scanner.close();
    }
}
