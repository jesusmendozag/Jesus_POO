package edu.yisus.RetoFinal.Tictactoe;

/**
 * LA CLASE `GenericPlayer` EXTIENDE LA CLASE `Player` Y REPRESENTA UN JUGADOR GENÉRICO.
 * NO IMPLEMENTA UN MÉTODO DE MOVIMIENTO, YA QUE SE ESPERA QUE SEA UTILIZADA POR CLASES DERIVADAS
 * QUE DEFINIRÁN SU PROPIA LÓGICA DE MOVIMIENTO.
 */
public class GenericPlayer extends Player{

    /**
     * CONSTRUYE UN NUEVO OBJETO `GenericPlayer` CON EL SÍMBOLO ESPECIFICADO.
     * @param symbol El símbolo del jugador ('X' o 'O').
     */
    public GenericPlayer(String symbol) {
        super(symbol);
    }

    /**
     * MÉTODO NO IMPLEMENTADO EN LA CLASE GENÉRICA.
     * LAS CLASES DERIVADAS DEBERÁN IMPLEMENTAR SU PROPIA LÓGICA DE MOVIMIENTO.
     * @return Siempre retorna 0, ya que no se ha implementado una lógica de movimiento genérica.
     */
    @Override
    public int makeMove() {
        return 0;
    }
}