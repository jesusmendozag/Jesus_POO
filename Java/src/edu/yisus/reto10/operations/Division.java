package edu.yisus.reto10.operations;

/**
 * CLASE DIVISIÓN QUE HEREDA DE RESTA
 */
public class Division extends Resta {

    /**
     * MÉTODO QUE SOBREESCRIBE LA OPERACIÓN QUE EN ESTE CASO SERA UNA DIVISIÓN
     * @param num1 EL PRIMERO OPERANDO
     * @param num2 EL SEGUNDO OPERANDO
     * @return NOS REGRESA EL RESULTADO DE LA OPERACION
     */
    @Override
    public double operacion(double num1, double num2) {
        if (num2 != 0) {
            double division = 0;
            while (num1 >= num2) {
                num1 = super.operacion(num1, num2);
                division++;
            }
            return division;
        }else {
            System.out.println("Error: División por cero.");
        }
        return 0;
    }

    /**
     * MÉTODO QUE SOBREESCRIBE EL SIMBOLO QUE EN ESTE CASO ES EL SIMBOLO DE DIVISIÓN
     * @return NOS REGRESA EL SIMBOLO DE DIVISIÓN
     */
    @Override
    public String getSimbolo() {
        return "÷";
    }
}
