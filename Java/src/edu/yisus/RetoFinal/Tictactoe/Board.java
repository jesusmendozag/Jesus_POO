package edu.yisus.RetoFinal.Tictactoe;
public class Board {
    private char[][] grid;
    private static final int SIZE = 3;

    public Board() {
        grid = new char[SIZE][SIZE];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                grid[i][j] = ' ';
            }
        }
    }

    public void displayBoard() {
        // Imprimir los números de las celdas en la parte superior
        for (int i = 1; i <= SIZE * SIZE; i++) {
            System.out.print(i + " ");
            if (i % SIZE == 0) {
                System.out.println();
            }
        }

        // Imprimir el tablero
        System.out.println("-------------");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("| ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(grid[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    public boolean isMoveValid(int move) {
        return move >= 1 && move <= SIZE * SIZE && grid[(move - 1) / SIZE][(move - 1) % SIZE] == ' ';
    }

    public void makeMove(int move, String symbol) {
        int row = (move - 1) / SIZE;
        int col = (move - 1) % SIZE;
        grid[row][col] = symbol.charAt(0);
    }

    public boolean isBoardFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (grid[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkForWinner() {
        return checkRows() || checkColumns() || checkDiagonals();
    }

    private boolean checkRows() {
        for (int i = 0; i < SIZE; i++) {
            if (grid[i][0] != ' ' && grid[i][0] == grid[i][1] && grid[i][1] == grid[i][2]) {
                return true;
            }
        }
        return false;
    }

    private boolean checkColumns() {
        for (int i = 0; i < SIZE; i++) {
            if (grid[0][i] != ' ' && grid[0][i] == grid[1][i] && grid[1][i] == grid[2][i]) {
                return true;
            }
        }
        return false;
    }

    private boolean checkDiagonals() {
        return (grid[0][0] != ' ' && grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2]) ||
                (grid[0][2] != ' ' && grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0]);
    }

    public boolean isGameOver() {
        return checkForWinner() || isBoardFull();
    }
}
