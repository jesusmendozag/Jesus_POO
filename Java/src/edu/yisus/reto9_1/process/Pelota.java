package edu.yisus.reto9_1.process;

public class Pelota {
    /**
     * Atributos de la clase pelota
     */
    private String color;
    private int rapidez;
    private int poder;

    /**
     *Constructor de la clase Pelota
     */
    public Pelota(String color, int rapidez, int poder) {
        this.color = color;
        this.rapidez = rapidez;
        this.poder = poder;
    }

    /**
     * Método para disminuir la rapidez de la pelota
     */
    public void disminuirRapidez() {
        if (rapidez > 0) {
            rapidez--;
            System.out.println("Rapidez disminuida a " + rapidez);
        } else {
            System.out.println("La rapidez ya está en su valor mínimo.");
        }
    }

    /**
     * Método para aumentar el poder de la pelota
     */
    public void aumentarPoder() {
        poder++;
        System.out.println("Poder aumentado a " + poder);
    }

    /**
     * Métodos para obtener los atributos de la pelota
     * @return
     */
    public String getColor() {
        return color;
    }

    public int getRapidez() {
        return rapidez;
    }

    public int getPoder() {
        return poder;
    }
}
