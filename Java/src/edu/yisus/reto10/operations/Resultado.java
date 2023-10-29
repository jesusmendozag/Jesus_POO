package edu.yisus.reto10.operations;

/**
 * CLASE RESULTADO QUE REPRESENTA EL RESULTADO DE UNA OPERACIÓN ARITMETICA.
 */
public class Resultado {
    private String operacion;

    private double resultado;

    /**
     * CONSTRUCTOR DE LA CLASE RESULTADO QUE RECIBE UNA INSTANCIA DE OPERACIONARITMETICA, ASÍ COMO DOS NÚMEROS PARA REALIZAR LA OPERACIÓN.
     */
    public Resultado(OperacionAritmetica op, double num1, double num2) {
        this.operacion = obtenerMensaje(op, num1, num2);
        this.resultado = op.operacion(num1, num2);
    }

    /**
     * MÉTODO PARA OBTENER LA DESCRIPCIÓN DE LA OPERACIÓN REALIZADA.
     */
    public String getOperacion() {
        return operacion;
    }

    /**
     * MÉTODO PARA OBTENER EL VALOR RESULTANTE DE LA OPERACIÓN
     */
    public double getResultado() {
        return resultado;
    }

    /**
     * MÉTODO ESTÁTICO QUE GENERA UN MENSAJE DESCRIPTIVO DE LA OPERACIÓN REALIZADA.
     */
    public static String obtenerMensaje(OperacionAritmetica op, double num1, double num2) {
        return op.getClass().getSimpleName() + ": " + num1 + " " + op.getSimbolo() + " " + num2 + " es = " + op.operacion(num1,num2);
    }
}
