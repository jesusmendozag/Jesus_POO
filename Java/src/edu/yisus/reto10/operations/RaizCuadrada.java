package edu.yisus.reto10.operations;

/**
 * CLASE RAIZCUADRADA QUE HEREDA DE OPERACIONARITMETICA
 */
public class RaizCuadrada extends Multiplicacion {

    /**
     * MÉTODO QUE SOBREESCRIBE LA OPERACIÓN QUE EN ESTE CASO SERA UNA RAIZ
     * @param num1 EL PRIMERO OPERANDO
     * @param num2 EL SEGUNDO OPERANDO
     * @return NOS REGRESA EL RESULTADO DE LA OPERACION
     */
    @Override
    public double operacion(double num1, double num2) {
        double resultado = 0.5;
        for (int i = 0; i < num2; i++) {
            resultado = super.operacion(resultado,num2);
        }
        return resultado;
    }

    /**
     * MÉTODO QUE SOBREESCRIBE EL SIMBOLO QUE EN ESTE CASO ES EL SIMBOLO DE RAIZ
     * @return NOS REGRESA EL SIMBOLO DE RAIZ
     */
    @Override
    public String getSimbolo() {
        return "√";
    }
}
