package edu.yisus.reto2.Figura.ui;

import edu.yisus.reto2.Figura.process.Pyramid;

import java.util.Scanner;
public class CLI {
    public static void showMenu() {
        /*
        Se agrega un sacanner para poder leer la respuesat o información que nos brinde el usuario y también se
        le pide al usuario la altura de la piramide.
         */
        Scanner scannerP = new Scanner(System.in);
        System.out.println("Ingresa la altura de la piramide");
        int eight = scannerP.nextInt();

        Pyramid.PrintPyramid(eight);
    }
}
