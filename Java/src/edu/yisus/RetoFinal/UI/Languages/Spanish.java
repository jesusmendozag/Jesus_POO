package edu.yisus.RetoFinal.UI.Languages;

public class Spanish implements Languages {

    @Override
    public String getMessage(String key) {
        switch (key) {
            case "welcome":
                return "\t¡Bienvenido al juego de Tic Tac Toe!";
            case "select_option":
                return "Selecciona una opción";
            case "menu":
                return "\tMenú\n1.Jugador VS Computadora\n2.Jugador VS Jugador\n3.Mostrar en ScoreBoard\n4.Salir";
            case "exit":
                return "Saliendo del juego. Hasta pronto!";
            case "error_choice":
                return "Opción invalida. Saliendo del juego.";
            case "invalid_move":
                return "Movimiento invalido. Intentalo de nuevo.";
            case "player":
                return "Jugador";
            case "win":
                return "Ganador!";
            case "tie":
                return "Es un empate!";
            case "human_move":
                return "Introduce tu movimiento (1-9): ";
            case "name":
                return "Ingresa tu nombre";
            case "error_score":
                return "Ocurrió un error al guardar los puntajes.";
            case "replay":
                return "Quieres volver a intentarlo? (s/n): ";
            case "you_have":
                return " tu tienes ";
            case "points":
                return " puntos";
            default:
                return "Mensaje no encontrado";
        }
    }
}