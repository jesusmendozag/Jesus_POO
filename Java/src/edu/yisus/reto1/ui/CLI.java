package edu.yisus.reto1.ui;

import edu.yisus.reto1.process.Calculator;

import java.util.Scanner;

public class CLI {
    public static void showMenu(){
        /*
          Este es el menú de la "aplicación" de la calculadora, pudiendo mostrar lo que
          puede hacer el usuario con procesos básicos de la calculadora y también
          agregando una opción de salida
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige una opcion");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Residuo");
        System.out.println("6. Salir");
        int opcionMenu = scanner.nextInt();

        /*
          Aquí le pedimos al usuario agregar dos numeros diferentes para poder
          realizar las operación que anteriormente pidio
         */
        System.out.println("introduce dato 1");
        int num1 = scanner.nextInt();
        System.out.println("introduce dato 2");
        int num2 = scanner.nextInt();

        /*
          Aquí se hace la operacion con un switch porque son varias opciones que puede
          elegir el usuario
         */
        switch (opcionMenu){
            case 1:
                System.out.print(num1 + " + " +num2+ " = "+ Calculator.sumaEnteros(num1,num2));
                break;

            case 2:
                System.out.println(num1 + " - " +num2+ " = "+ Calculator.restaEnteros(num1,num2));
                break;

            case 3:
                System.out.println(num1 + " * " +num2+ " = "+ Calculator.multiplicacionEnteros(num1,num2));
                break;

            case 4:
                System.out.println(num1 + " / " +num2+ " = "+ Calculator.divicionEnteros(num1,num2));
                break;

            case 5:
                System.out.println(num1 + " % " +num2+ " = "+ Calculator.moduloEnteros(num1,num2));
                break;

            case 6:
                System.out.println("Muchas gracias por su preferencia :)");
                break;
            default:
        }
    }
}
