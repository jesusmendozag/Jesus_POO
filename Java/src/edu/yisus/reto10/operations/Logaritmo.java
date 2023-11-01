package edu.yisus.reto10.operations;

/**
 * CLASE LOGARITMO QUE HEREDA DE RESTA
 */
public class Logaritmo extends Division {

    /**
     * MÉTODO QUE SOBREESCRIBE LA OPERACIÓN QUE EN ESTE CASO SERA UN LOGARITMO
     * @param num1 EL PRIMERO OPERANDO
     * @param num2 EL SEGUNDO OPERANDO
     * @return NOS REGRESA EL RESULTADO DE LA OPERACION
     */
    @Override
    public double operacion(double num1, double num2) {
        if (num1 > 0) {
            double resultado = 0;
            double base = 10;

            for (double i = 1; i <= num1; i++) {
                resultado += Math.log(i) / Math.log(base);
            }

            return resultado;
        } else {
            System.out.println("Error: No se puede calcular el logaritmo con el número proporcionado.");
            return Double.NaN;
        }
    }

    /**
     * MÉTODO QUE SOBREESCRIBE EL SIMBOLO QUE EN ESTE CASO NO ES SIMBOLO PERO ES LO QUE REPRESENTA EL LOGARITMO
     * @return NOS REGRESA EL REPRESENTANTE DE LOGARITMO
     */
    @Override
    public String getSimbolo() {
        return "log";
    }
}
