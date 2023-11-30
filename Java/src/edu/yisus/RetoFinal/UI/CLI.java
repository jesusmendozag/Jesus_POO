package edu.yisus.RetoFinal.UI;
import edu.yisus.RetoFinal.Languages.English;
import edu.yisus.RetoFinal.Languages.Japanese;
import edu.yisus.RetoFinal.Languages.Languages;
import edu.yisus.RetoFinal.Languages.Spanish;

import java.util.Scanner;

public class CLI {

    public static Languages selectLanguage() {
        System.out.println("Select language:");
        System.out.println("1. English");
        System.out.println("2. Español");
        System.out.println("3. 日本語");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                return new English();
            case 2:
                return new Spanish();
            case 3:
                return new Japanese();
            default:
                System.out.println("Invalid choice. Defaulting to English.");
                return new English();
        }
    }
}