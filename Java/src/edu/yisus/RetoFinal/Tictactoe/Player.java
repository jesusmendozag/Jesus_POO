package edu.yisus.RetoFinal.Tictactoe;

public abstract class Player {
    protected String symbol;
    protected String name;
    protected int score;

    public Player(String symbol) {
        this.symbol = symbol;
        this.name = name;
        this.score = 0;
    }

    public abstract int makeMove();

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}