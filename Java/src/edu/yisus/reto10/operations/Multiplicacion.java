package edu.yisus.reto10.operations;

/**
 * CLASE MULTIPLICACIÓN QUE HEREDA DE SUMA
 */
public class Multiplicacion extends Suma {

    /**
     * MÉTODO QUE SOBREESCRIBE LA OPERACIÓN QUE EN ESTE CASO SERA UNA MULTPLICACIÓN
     * @param num1 EL PRIMERO OPERANDO
     * @param num2 EL SEGUNDO OPERANDO
     * @return NOS REGRESA EL RESULTADO DE LA OPERACION
     */
    @Override
    public double operacion(double num1, double num2) {
        double multiplicacion = 0;
        for (double i = 0; i < num1; i++){
            multiplicacion = super.operacion(multiplicacion, num2);
        }
        return multiplicacion;
    }

    /**
     * MÉTODO QUE SOBREESCRIBE EL SIMBOLO QUE EN ESTE CASO ES EL SIMBOLO DE MULTIPLICACIÓN
     * @return NOS REGRESA EL SIMBOLO DE MULTIPLICACIÓN
     */
    @Override
    public String getSimbolo(){
        return "*";
    }
}
