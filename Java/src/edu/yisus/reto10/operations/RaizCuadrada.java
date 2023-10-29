package edu.yisus.reto10.operations;

/**
 * CLASE RAIZCUADRADA QUE HEREDA DE OPERACIONARITMETICA
 */
public class RaizCuadrada extends OperacionAritmetica {

    /**
     * MÉTODO QUE SOBREESCRIBE LA OPERACIÓN QUE EN ESTE CASO SERA UNA RAIZ (EN ESTE CASO TUVE PROBLEMAS CON EL HECHO DE PODER SACAR LA RAIZ DE LOS DOS NÚMEROS)
     * @param num1 EL PRIMERO OPERANDO
     * @param num2 EL SEGUNDO OPERANDO
     * @return NOS REGRESA EL RESULTADO DE LA OPERACION
     */
    @Override
    public double operacion(double num1, double num2) {
        double raizCuadrada1 = Math.sqrt(num1);
        double raizCuadrada2 = Math.sqrt(num2);
        return raizCuadrada1;
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
