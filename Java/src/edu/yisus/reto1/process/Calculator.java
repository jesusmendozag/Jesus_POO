package edu.yisus.reto1.process;

/**
 * @author Jesus Mendoza
 * Esta calse contiene la logica de las operaciones aritmeticas
 * bascias, suma, resta, multiplicacion, division y modulo
 **/
public class Calculator {
    /**
     *
     * @param num1 primer operando de la suma
     * @param num2 segundo opreando de la suma
     * @return el resulado de la suma de num1 y num2
     *
     * Este metodo sirve para sumar dos numeros enteros
     */
    public static int sumaEnteros(int num1, int num2){
        return num1 + num2;
    }

    /**
     *
     * @param num1 primer oprenado de la resta
     * @param num2 segundo operando de la resta
     * @return el resultado de la resta de num1 y num2
     *
     * Este metodo sirve para sumar dos numeros enteros
     */
    public static int restaEnteros(int num1, int num2){
        return num1 - num2;
    }

    /**
     *
     * @param num1 primer operando de la multiplicacion
     * @param num2 segundo operando de la multiplicacion
     * @return el resultado de la multiplicacion de num1 y num2
     *
     * Este metodo sirve para multiplicar dos numros enteros
     */
    public static int multiplicacionEnteros(int num1, int num2){
        return num1 * num2;
    }

    /**
     *
     * @param num1 primer operando de la division
     * @param num2 segundo operando de la division
     * @return el resultado de la division de num1 y num2
     *
     * Este metodo sirve para dividir dos numeros enteros
     */
    public static int divicionEnteros(int num1, int num2){
        return num1 / num2;
    }

    /**
     *
     * @param num1 primer operando del residuo
     * @param num2 segundo operando del residuo
     * @return el reultado del residuo de num1 y num2
     *
     * Este metodo sirve para sacar el residuo entre dos numeros enteros
     */
    public static int moduloEnteros(int num1, int num2){
        return num1 % num2;
    }
}