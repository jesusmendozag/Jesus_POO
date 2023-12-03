package edu.yisus.RetoFinal.Tictactoe;

/**
 * LA CLASE `Player` ES UNA CLASE ABSTRACTA QUE REPRESENTA UN JUGADOR EN EL JUEGO DE TRES EN LÍNEA (TA-TE-TI).
 * PROPORCIONA MÉTODOS Y ATRIBUTOS COMUNES A TODOS LOS JUGADORES, Y DEFINE UN MÉTODO ABSTRACTO PARA REALIZAR MOVIMIENTOS.
 */
public abstract class Player {
    protected String symbol;
    protected String name;
    protected int score;

    /**
     * CONSTRUYE UN NUEVO OBJETO `Player` CON EL SÍMBOLO ESPECIFICADO.
     * @param symbol El símbolo del jugador ('X' o 'O').
     */
    public Player(String symbol) {
        this.symbol = symbol;
        this.name = name;
        this.score = 0;
    }

    /**
     * REPRESENTA LA LÓGICA DE MOVIMIENTO DEL JUGADOR EN EL JUEGO.
     * @return La celda o posición elegida por el jugador.
     */
    public abstract int makeMove();

    /**
     * OBTIENE EL SÍMBOLO DEL JUGADOR.
     * @return El símbolo del jugador ('X' o 'O').
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * OBTIENE EL NOMBRE DEL JUGADOR.
     * @return El nombre del jugador.
     */
    public String getName() {
        return name;
    }

    /**
     * OBTIENE LA PUNTUACIÓN ACTUAL DEL JUGADOR.
     * @return La puntuación del jugador.
     */
    public int getScore() {
        return score;
    }

    /**
     * ESTABLECE EL NOMBRE DEL JUGADOR.
     * @param name El nombre que se asignará al jugador.
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * ESTABLECE LA PUNTUACIÓN DEL JUGADOR.
     * @param score La puntuación que se asignará al jugador.
     */
    public void setScore(int score){
        this.score = score;
    }
}