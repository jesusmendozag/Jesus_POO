package edu.yisus.reto10.operations;

/**
 * CLASE SUMA QUE HEREDA DE OPERACIONARITMETICA
 */
public class Suma extends OperacionAritmetica {

    /**
     * MÉTODO QUE SOBREESCRIBE LA OPERACIÓN QUE EN ESTE CASO SERA UNA SUMA
     * @param num1 EL PRIMERO OPERANDO
     * @param num2 EL SEGUNDO OPERANDO
     * @return NOS REGRESA EL RESULTADO DE LA OPERACION
     */
    @Override
    public double operacion(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * MÉTODO QUE SOBREESCRIBE EL SIMBOLO QUE EN ESTE CASO ES EL SIMBOLO DE SUMA
     * @return NOS REGRESA EL SIMBOLO DE SUMA
     */
    @Override
    public String getSimbolo () {
        return "+";
    }
}