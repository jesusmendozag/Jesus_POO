package edu.yisus.RetoFinal.Tictactoe;
import java.util.Random;

public class IAplayer extends Player {
    private Random random;

    public IAplayer(String symbol) {
        super(symbol);
        random = new Random();
    }

    @Override
    public int makeMove() {
        return random.nextInt(9) + 1;
    }
}