package src.edu.yisus.reto3.process;

import java.util.Scanner;

/*
Se agregan varias public's para cada conversión que queremos que el programa realice, pidiendo
al usuario el digito que desea cambiar para que la computadora pueda convertirlo
 */

public class converter {
    public static void convertDecimalBinary (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número decimal: ");
        int n = scanner.nextInt();

        String bin = Integer.toBinaryString(n);
        System.out.println("El número " + n + " en sistema binario es: " + bin);
    }
    public static void convertDecimalToOctal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número decimal: ");
        int n = scanner.nextInt();

        String octal = Integer.toOctalString(n);
        System.out.println("El número " + n + " en sistema octal es: " + octal);

    }

    public static void convertDecimalHexadecimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número decimal: ");
        int n = scanner.nextInt();

        String hexa = Integer.toHexString(n);
        System.out.println("El número " + n + " en sistema hexadecimal es: " + hexa);
    }
    public static void convertBinaryToDecimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número binario: ");
        String nD = scanner.nextLine();

        int decimal = Integer.parseInt(nD, 2);

        System.out.println("El número binario " + nD + " en sistema decimal es: " + decimal);
    }
    public static void convertOctalADecimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número octal: ");
        String nO = scanner.nextLine();

        int decimal = Integer.parseInt(nO, 8);

        System.out.println("El número octal " + nO + " en sistema decimal es: " + decimal);
    }

    public static void convertHexadecimalToDecimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número hexadecimal: ");
        String nH = scanner.nextLine();

        int decimal = Integer.parseInt(nH, 16);

        System.out.println("Número hexadecimal " + nH + " en sistema decimal: " + decimal);
    }
}
