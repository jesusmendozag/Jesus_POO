package edu.yisus.reto2.Boleto.process;

public class Tickets {
    public static void BuyMachineTickets(String TypeTicket) {
        /*
        Se define una variable, en este caso, un entero "price" para saber el precio de cada boleto.
         */
        int price;
        /*
        Aquí utilizamos un switch para cada tipo de boleto y darle su respectivo precio.
         */
        switch (TypeTicket) {
            case "Adulto":
                price = 100;
                break;
            case "Niño":
                price = 70;
                break;
            case "Adulto mayor con INAPAM":
                price = 50;
                break;
            case "Adulto mayor sin credencial":
                price = 70;
                break;
            default:
                price = 0;
                break;
        }
        /*
        Se utiliza un if para que mande un mensaje cada que se compre un boleto dando su precio y el tipo
        de boleto que es, y en dado caso de que no se ingrese un tipo de boleto válido, también se escribirá
        un mensaje.
         */
        if (price > 0) {
            System.out.println("El precio del boleto de " + TypeTicket + " cuesta: $" + price);
        }
        else {
            System.out.println("Favor de ingresar un boleto válido.");
        }
    }
}
