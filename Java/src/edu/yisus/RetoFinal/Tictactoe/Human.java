package edu.yisus.RetoFinal.Tictactoe;
import edu.yisus.RetoFinal.UI.Languages.LanguagesFactory;
import java.util.Scanner;

public class Human extends Player {
    private Scanner scanner;

    public Human(String symbol) {
        super(symbol);
        scanner = new Scanner(System.in);
        System.out.println(LanguagesFactory.getMessage("name"));
        this.name = scanner.nextLine();
    }

    @Override
    public int makeMove() {
        System.out.print(LanguagesFactory.getMessage("human_move"));
        return scanner.nextInt();
    }
}