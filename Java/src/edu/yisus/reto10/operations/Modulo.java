package edu.yisus.reto10.operations;

/**
 * CLASE MODULO QUE HEREDA DE RESTA
 */
public class Modulo extends Resta{

    /**
     * MÉTODO QUE SOBREESCRIBE LA OPERACIÓN QUE EN ESTE CASO SERA SACAR EL MODULO
     * @param num1 EL PRIMERO OPERANDO
     * @param num2 EL SEGUNDO OPERANDO
     * @return NOS REGRESA EL RESULTADO DE LA OPERACION
     */
    @Override
    public double operacion(double num1, double num2) {
        if (num2 != 0) {
            while (num1 >= num2) {
                num1 = super.operacion(num1, num2);
            }
            return num1;
        }else {
            System.out.println("Error: División por cero en el cálculo del módulo");
        }
        return 0;
    }

    /**
     * MÉTODO QUE SOBREESCRIBE EL SIMBOLO QUE EN ESTE CASO ES EL SIMBOLO DE MODULO
     * @return NOS REGRESA EL SIMBOLO DE MODULO
     */
    @Override
    public String getSimbolo() {
        return "%";
    }
}
