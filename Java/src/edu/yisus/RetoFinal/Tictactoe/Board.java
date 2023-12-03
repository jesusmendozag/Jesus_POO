package edu.yisus.RetoFinal.Tictactoe;

/**
 * LA CLASE `Board` REPRESENTA EL TABLERO DE JUEGO DE TRES EN LÍNEA.
 * INCLUYE MÉTODOS PARA INICIALIZAR EL TABLERO, MOSTRARLO, REALIZAR MOVIMIENTOS,
 * COMPROBAR UN GANADOR Y DETERMINAR SI EL JUEGO HA TERMINADO.
 */
public class Board {
    private char[][] grid;
    private static final int SIZE = 3;

    /**
     * CONSTRUYE UN NUEVO OBJETO `Board` E INICIALIZA EL TABLERO DEL JUEGO.
     */
    public Board() {
        grid = new char[SIZE][SIZE];
        initializeBoard();
    }

    /**
     * INICIALIZA EL TABLERO DEL JUEGO CON ESPACIOS VACÍOS EN CADA CELDA.
     */
    private void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                grid[i][j] = ' ';
            }
        }
    }

    /**
     * MUESTRA EL ESTADO ACTUAL DEL TABLERO DE JUEGO.
     * LOS NÚMEROS DE LAS CELDAS SE IMPRIMEN EN LA PARTE SUPERIOR PARA REFERENCIA PARA EL USUARIO.
     */
    public void displayBoard() {
        // Imprimir los números de las celdas en la parte superior
        for (int i = 1; i <= SIZE * SIZE; i++) {
            System.out.print(i + " ");
            if (i % SIZE == 0) {
                System.out.println();
            }
        }

        /**
         * IMPRIME EL TABLERO ACTUAL
         */
        System.out.println("-------------");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("| ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(grid[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    /**
     * COMPRUEBA SI UN MOVIMIENTO ES VÁLIDO SEGÚN EL NÚMERO DE CELDA Y SI LA CELDA ESTÁ VACÍA.
     * @param move El número de celda que representa el movimiento.
     * @return true si el movimiento es válido, false en caso contrario.
     */
    public boolean isMoveValid(int move) {
        return move >= 1 && move <= SIZE * SIZE && grid[(move - 1) / SIZE][(move - 1) % SIZE] == ' ';
    }

    /**
     * REALIZA UN MOVIMIENTO EN EL TABLERO COLOCANDO EL SÍMBOLO ESPECIFICADO EN LA CELDA INDICADA.
     * @param move   El número de celda que representa el movimiento.
     * @param symbol El símbolo del jugador ('X' o 'O').
     */
    public void makeMove(int move, String symbol) {
        int row = (move - 1) / SIZE;
        int col = (move - 1) % SIZE;
        grid[row][col] = symbol.charAt(0);
    }

    /**
     * COMPRUEBA SI EL TABLERO DE JUEGO ESTÁ LLENO, ES DECIR, SI NO QUEDAN CELDAS VACÍAS.
     * @return true si el tablero está lleno, false en caso contrario.
     */
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

    /**
     * COMPRUEBA SI HAY UN GANADOR EN EL TABLERO EXAMINANDO FILAS, COLUMNAS Y DIAGONALES.
     * @return true si hay un ganador, false en caso contrario.
     */
    public boolean checkForWinner() {
        return checkRows() || checkColumns() || checkDiagonals();
    }

    /**
     * COMPRUEBA SI HAY UN GANADOR EN CADA FILA DEL TABLERO.
     * @return true si se encuentra un ganador en alguna fila, false en caso contrario.
     */
    private boolean checkRows() {
        for (int i = 0; i < SIZE; i++) {
            if (grid[i][0] != ' ' && grid[i][0] == grid[i][1] && grid[i][1] == grid[i][2]) {
                return true;
            }
        }
        return false;
    }

    /**
     * COMPRUEBA SI HAY UN GANADOR EN CADA COLUMNA DEL TABLERO.
     * @return true si se encuentra un ganador en alguna columna, false en caso contrario.
     */
    private boolean checkColumns() {
        for (int i = 0; i < SIZE; i++) {
            if (grid[0][i] != ' ' && grid[0][i] == grid[1][i] && grid[1][i] == grid[2][i]) {
                return true;
            }
        }
        return false;
    }

    /**
     * COMPRUEBA SI HAY UN GANADOR EN LAS DOS DIAGONALES PRINCIPALES DEL TABLERO.
     * @return true si se encuentra un ganador en alguna diagonal, false en caso contrario.
     */
    private boolean checkDiagonals() {
        return (grid[0][0] != ' ' && grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2]) ||
                (grid[0][2] != ' ' && grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0]);
    }

    /**
     * COMPRUEBA SI EL JUEGO HA TERMINADO, YA SEA POR UN GANADOR O POR UN TABLERO LLENO.
     * @return true si el juego ha terminado, false en caso contrario.
     */
    public boolean isGameOver() {
        return checkForWinner() || isBoardFull();
    }
}
