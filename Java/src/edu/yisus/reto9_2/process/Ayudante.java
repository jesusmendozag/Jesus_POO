package edu.yisus.reto9_2.process;

public class Ayudante {
    /**
     * Atributos de los clase Ayudantes
     */
    private String nombre;
    private int numeroDeOjos;
    private String colorDePiel;
    private String altura;
    private int nivelCreacion;
    private int nivelArreglo;
    private int nivelDestructivo;

    /**
     * Constructor de la clase Ayudante
     */
    public Ayudante(String nombre, int numeroDeOjos, String colorDePiel, String altura, int nivelCreacion, int nivelArreglo, int nivelDestructivo) {
        this.nombre = nombre;
        this.numeroDeOjos = numeroDeOjos;
        this.colorDePiel = colorDePiel;
        this.altura = altura;
        this.nivelCreacion = nivelCreacion;
        this.nivelArreglo = nivelArreglo;
        this.nivelDestructivo = nivelDestructivo;
    }

    /**
     * Sobrescribir el método toString para poder obtener una representación en cadena del
     * Objeto
     * @return
     */
    @Override
    public String toString() {
        return "Soy " + nombre + ", tengo " + numeroDeOjos + " ojo(s), piel " + colorDePiel + ", soy de altura " + altura + ", y tengo habilidades:\n" +
                "Nivel de creación: " + nivelCreacion + "\n" +
                "Nivel de arreglo: " + nivelArreglo + "\n" +
                "Nivel destructivo: " + nivelDestructivo;
    }
}
