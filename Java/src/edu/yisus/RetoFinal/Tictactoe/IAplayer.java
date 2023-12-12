package edu.yisus.RetoFinal.Tictactoe;
import java.util.Random;

/**
 * LA CLASE `IAplayer` EXTIENDE LA CLASE `Player` Y REPRESENTA UN JUGADOR CONTROLADO POR LA INTELIGENCIA ARTIFICIAL (IA).
 * IMPLEMENTA UN MÉTODO PARA REALIZAR MOVIMIENTOS AUTOMÁTICOS DE LA IA.
 */
public class IAplayer extends Player {
    private Random random;

    /**
     * CONSTRUYE UN NUEVO OBJETO `IAplayer` CON EL SÍMBOLO ESPECIFICADO.
     * @param symbol El símbolo del jugador controlado por la IA ('X' o 'O').
     */
    public IAplayer(String symbol) {
        super(symbol);
        random = new Random();
    }

    /**
     * GENERA UN MOVIMIENTO DE LA IA DE FORMA AUTOMÁTICA.
     * @return El número de la celda seleccionada por la IA.
     */
    @Override
    public int makeMove() {
        return random.nextInt(9) + 1;
    }
}