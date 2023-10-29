package edu.yisus.reto10.main;
import edu.yisus.reto10.operations.*;
import java.util.ArrayList;

/**
 * CLASE MAIN QUE CONTIENE EL PROGRAMA PRINCIPAL DONDE SE REALIZAN OPERACIONES ARITMETICAS UTILIZANDO LAS CLASES ANTERIORES.
 */
public class Main {
    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 5;

        ArrayList<Resultado> resultados = new ArrayList<>();

        OperacionAritmetica suma = new Suma();
        OperacionAritmetica resta = new Resta();
        OperacionAritmetica multiplicacion = new Multiplicacion();
        OperacionAritmetica division = new Division();
        OperacionAritmetica modulo = new Modulo();
        OperacionAritmetica raiz = new RaizCuadrada();
        OperacionAritmetica logaritmo = new Logaritmo();

        resultados.add(new Resultado(suma, num1, num2));
        resultados.add(new Resultado(multiplicacion, num1, num2));
        resultados.add(new Resultado(resta, num1, num2));
        resultados.add(new Resultado(division, num1, num2));
        resultados.add(new Resultado(modulo, num1, num2));
        resultados.add(new Resultado(logaritmo, num1, num2));
        resultados.add(new Resultado(raiz, num1, num2));

        for (Resultado resultado : resultados) {
            System.out.println(resultado.getOperacion());
        }
    }
}