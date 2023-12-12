package edu.yisus.RetoFinal.Tictactoe;
import edu.yisus.RetoFinal.UI.Languages.LanguagesFactory;
import java.util.Scanner;

/**
 * LA CLASE `Human` EXTIENDE LA CLASE `Player` Y REPRESENTA UN JUGADOR HUMANO.
 * IMPLEMENTA UN MÉTODO PARA REALIZAR MOVIMIENTOS Y SOLICITA EL NOMBRE DEL JUGADOR AL INICIAR.
 */
public class Human extends Player {
    private Scanner scanner;

    /**
     * CONSTRUYE UN NUEVO OBJETO `Human` CON EL SÍMBOLO ESPECIFICADO.
     * SOLICITA EL NOMBRE DEL JUGADOR Y ASIGNA UN SCANNER PARA RECIBIR ENTRADAS DEL USUARIO.
     * @param symbol El símbolo del jugador ('X' o 'O').
     */
    public Human(String symbol) {
        super(symbol);
        scanner = new Scanner(System.in);
        System.out.println(LanguagesFactory.getMessage("name"));
        this.name = scanner.nextLine();
    }

    /**
     * SOLICITA AL JUGADOR HUMANO QUE INGRESE EL MOVIMIENTO Y RETORNA EL NÚMERO DE LA CELDA.
     * @return El número de la celda seleccionada por el jugador.
     */
    @Override
    public int makeMove() {
        System.out.print(LanguagesFactory.getMessage("human_move"));
        return scanner.nextInt();
    }
}