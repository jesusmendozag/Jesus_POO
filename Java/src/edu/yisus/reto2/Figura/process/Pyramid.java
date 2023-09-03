package edu.yisus.reto2.Figura.process;

public class Pyramid {
    public static void PrintPyramid (int height) {
        /*
        Se hace un for para la realización del código deuna piramide dependiendo del número o información
        que le no de el cliente o el ususario.
         */
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
