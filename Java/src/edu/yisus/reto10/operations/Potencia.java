package edu.yisus.reto10.operations;

/**
 * CLASE POTENCIA QUE HEREDA DE LA CLASE MULTIPLICACION
 */
public class Potencia extends Multiplicacion {
    /**
     * MÉTODO QUE SOBREESCRIBE LA OPERACIÓN QUE EN ESTE CASO SERA UNA POTENCIA
     * @param num1 EL PRIMERO OPERANDO
     * @param num2 EL SEGUNDO OPERANDO
     * @return NOS REGRESA EL RESULTADO DE LA OPERACION
     */
    @Override
    public double operacion(double num1, double num2) {
        double resultado = 1;
        for (int i = 0; i < num2; i++) {
            resultado = super.operacion(resultado,num2);
        }
        return resultado;
    }

    /**
     * MÉTODO QUE SOBREESCRIBE EL SIMBOLO QUE EN ESTE CASO ES EL SIMBOLO DE POTENCIA
     * @return NOS REGRESA EL SIMBOLO DE POTENCIA
     */
    @Override
    public String getSimbolo() {
        return "^";
    }
}
