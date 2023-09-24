package edu.yisus.tarea5.process;

import java.util.Random;

import java.util.Random;

public class GameGenerator {
    /**
    SE CREAN MODULOS PARA CADA NIVEL EN DONDE CONTENGA LA PALABRA QUE SE VA A TRATAR DE ADVINAR
     */
    private String[] easyWord = {"casa"};
    private String[] intermediateWord = {"programa"};
    private String[] advancedWord = {"enciclopedia"};
    /**
    TAMBIÉN SE DEFINEN ALGUNAS VARIABLES PARA PODER UTILIZARLAS EN TODO EL CÓDIGO
    Y SIMPLEMENTE MANDARLAS A LLAMAR
     */
    private String level;
    private String word;
    private char[] guesses;
    public int remainingAttempts;
    /**
    SE DEFINE UN MODULO PARA PODER SABER CUNATOS INTENTOS TIENE Y PODER GENERAR EL JUEGO
     */
    public GameGenerator(String level) {
        this.level = level;
        initializeWord();
        this.guesses = new char[word.length()];
        this.remainingAttempts = 4;
    }
    /**
    ESTE MODULO ES PARA PODER LEER LA RESPUESTA O EN ESTE CASO EL NIVEL QUE EL JUGADOR
    ELIGIRA Y QUE DENTRO HAY UN IF PARA CADA NIVEL Y SE LE DE AL JUGADOR LA PALABRA CORRECTA
     */
    private void initializeWord() {
        Random random = new Random();
        String[] selectedWords = null;
        if (level.equals("easy")) {
            selectedWords = easyWord;
        } else if (level.equals("intermediate")) {
            selectedWords = intermediateWord;
        } else if (level.equals("advanced")) {
            selectedWords = advancedWord;
        }
        if (selectedWords != null) {
            int index = random.nextInt(selectedWords.length);
            this.word = selectedWords[index];
        }
    }
    /**
    UN MODULO EN PARA PODER LEER LA LETRA QUE DARÁ DE RESPUESTA EL JJUGADOR, ES POR ESO QUE
    ESTA INICIALIZADA COMO BOOLEANO
     */
    public boolean isValidGuess(String guess) {
        return guess.length() == 1 && Character.isLetter(guess.charAt(0));
    }
    /**
    OTRO MODULO BOLOEANA PARA PODER SABER SI LA RESPUESTA ES CORRECTA Y EN DADO CASO QUE NO
    SEA PODER RESTAR LOS INTENTOS QUE TENEMOS
     */
    public boolean guess(char guess) {
        boolean correctGuess = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess) {
                guesses[i] = guess;
                correctGuess = true;
            }
        }
        if (!correctGuess) {
            remainingAttempts--;
        }
        return correctGuess;
    }

    /**
    UN MODULO PARA PODER SABER CUANTAS VECES SE A EQUIVOCADO EL JUGADOR Y ASÍ PODER DECIR
    QUE PERDIÓ EN EL MINI JUEGO
     */
    public boolean gameOver() {
        if (remainingAttempts == 0) {
            return true;
        }
        return word.equals(String.valueOf(guesses));
    }
    /**
    ESTE MODULO SIRVE PARA PODER VISUALIZAR LA LETRA QUE EL JUGADOR PROPORCIONO EN DADO CASO
    DE SER CORRECTA Y ASI PODER QUITAR EL GUIÓN BAJO
     */
    public String getDisplayWord() {
        StringBuilder displayWord = new StringBuilder();
        for (char guess : guesses) {
            if (Character.isLetter(guess)) {
                displayWord.append(guess);
            } else {
                displayWord.append('_');
            }
        }
        return displayWord.toString();
    }
}