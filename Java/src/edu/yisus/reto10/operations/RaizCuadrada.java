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
        double base = 1;
        double resultado = 0;
        while (true) {
            resultado = super.operacion(base,num2);
            if (resultado > num1) {
                base--;
                break;
            }
            base++;
        }
        return base;
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
