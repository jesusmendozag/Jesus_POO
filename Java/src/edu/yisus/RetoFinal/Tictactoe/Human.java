package edu.yisus.RetoFinal.Tictactoe;
import java.util.Scanner;

public class Human extends Player {
    private Scanner scanner;

    public Human(String symbol) {
        super(symbol);
        scanner = new Scanner(System.in);
    }

    @Override
    public int makeMove() {
        System.out.print("Enter your move (1-9): ");
        return scanner.nextInt();
    }
}
