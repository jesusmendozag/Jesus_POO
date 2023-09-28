package edu.yisus.reto4.UI;

import static edu.yisus.reto4.process.reportGenerator.*;

public class CLI {
    /*
    Aquí agregamos un arreglo donde definimos cuales son los valores dentro del arreglo
     */
    public static void showTable() {
        String[] sabores = {"Chocolate", "Vainilla", "Fresa", "Oreo"};
        int[][] ventas = new int[][]{
                {111, 483, 471, 427},
                {192, 500, 355, 158},
                {289, 470, 474, 160},
                {415, 114, 161, 308},
        };
        /*
        Aquí solo mandamos a llamar a todos lo metodos que hicimos en la parte del process
         */
        getSaborMasProductivo(ventas);
        saborMasVendidoTrimestral(ventas);
        sumaColumnas(ventas);
        for (int i = 0; i < ventas.length; i++) {
        }
    }
}
