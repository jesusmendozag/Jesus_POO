package edu.yisus.tarea5;

import edu.yisus.tarea5.UI.CLI;

public class Main {
    /**
    AQUÍ SIMPLEMENTE SE LLAMA A TODO LO QUE ESTA EN EL CLI LO QUE SERIA TODO LO QUE VE EL
    USUARIO
     */
        public static void main(String[] args) {
            CLI gameCLI = new CLI();
            gameCLI.startGame();
        }
}