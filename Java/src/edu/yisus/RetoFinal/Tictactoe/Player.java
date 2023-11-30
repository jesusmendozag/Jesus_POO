package edu.yisus.RetoFinal.Tictactoe;

public abstract class Player {
    protected String symbol;

    public Player(String symbol) {
        this.symbol = symbol;
    }

    public abstract int makeMove();

    public String getSymbol() {
        return symbol;
    }
}