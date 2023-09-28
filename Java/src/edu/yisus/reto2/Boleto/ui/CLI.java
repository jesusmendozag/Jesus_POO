package edu.yisus.reto2.Boleto.ui;

import edu.yisus.reto2.Boleto.process.Tickets;

import java.util.Scanner;

public class CLI {
    public static void showMenu () {
        /*
        Se agrega un scanner para que pueda leer la información que de el cliente.
         */
        Scanner scanner = new Scanner(System.in);

        Tickets tickets = new Tickets();
        /*
        se agrega un mensaje de bienbenida para los clientes.
         */
        System.out.println("\t¡Bienvenidos a la Feria!");
        System.out.println("\nVenta de boletos aquí ☟");
        /*
        Se introduce un while para donde enseñe un menú para que el cliente pueda ver los tipos de boletos
         */
        while (true) {
            System.out.println("\nSeleccione el tipo de boleto:");
            System.out.println("A - Adulto\nN - Niño\nI - Adulto Mayor con INAPAM\nB - Adulto Mayor sin credencial");
            System.out.println("E - Salir");

            String option = scanner.next();
            /*
            Se agrega un switch para la elección del cliente en dónde en cada caso se imprimira la opción
            de volver a comprar un boleto y también en dado caso en donde el cliente no da una opción válida.
             */
            switch (option) {
                case "A", "a":
                    Tickets.BuyMachineTickets("Adulto");

                    System.out.println("¿Desea comprar otro boleto? (S/N)");
                    String answer1 = scanner.next();

                    if (answer1.equalsIgnoreCase("S")) {
                        System.out.println("Gracias por su compra\nDisfrute su visita");
                    }
                    break;

                case "N", "n":
                    Tickets.BuyMachineTickets("Niño");

                    System.out.println("¿Desea comprar otro boleto? (S/N)");
                    String answer2 = scanner.next();

                    if (answer2.equalsIgnoreCase("S")) {
                        System.out.println("Gracias por su compra\nDisfrute su visita");
                    }
                    break;
                case "I", "i":
                    Tickets.BuyMachineTickets("Adulto Mayor con INAPAM");

                    System.out.println("¿Desea comprar otro boleto? (S/N)");
                    String answer3 = scanner.next();

                    if (answer3.equalsIgnoreCase("S")) {
                        System.out.println("Gracias por su compra\nDisfrute su visita");
                    }
                    break;
                case "B", "b":
                    Tickets.BuyMachineTickets("Adulto Mayor sin credencial");

                    System.out.println("¿Desea comprar otro boleto? (S/N)");
                    String answer4 = scanner.next();

                    if (answer4.equalsIgnoreCase("S")) {
                        System.out.println("Gracias por su compra\nDisfrute su visita");
                    }
                    break;
                case "E", "e":
                    System.out.println("Gracias");
                    return;
                default:
                    System.out.println("Opción no válida\nFavor de seleccionar una opción válida");
            }
        }
    }
}
