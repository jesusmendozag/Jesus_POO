package edu.yisus.reto10.operations;
import edu.yisus.reto10.Idiomas.LanguageFactory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Resultado {
    private OperacionAritmetica operacion;
    private double num1;
    private double num2;

    public Resultado(OperacionAritmetica op, double num1, double num2) {
        this.operacion = op;
        this.num1 = num1;
        this.num2 = num2;
    }

    public double obtenerResultado() {
        return operacion.operacion(num1, num2);
    }

    public String obtenerMensaje() {
        String simbolo = operacion.getSimbolo();
        String operacionStr = obtenerDescripcionOperacion(simbolo);
        String mensaje = String.format("%s, %s, %s, %s, %s, %s", operacionStr, num1, simbolo, num2, LanguageFactory.getMessage("is"), obtenerResultado());

        Path path = Paths.get("Operaciones.txt");

        try {
            Files.write(path, mensaje.getBytes(), StandardOpenOption.APPEND, StandardOpenOption.CREATE);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return mensaje;
    }

    private String obtenerDescripcionOperacion(String simbolo) {
        switch (simbolo) {
            case "+":
                return LanguageFactory.getMessage("Adding");
            case "-":
                return LanguageFactory.getMessage("Subtracting");
            case "*":
                return LanguageFactory.getMessage("multiplication");
            case "/":
                return LanguageFactory.getMessage("Dividing");
            case "%":
                return LanguageFactory.getMessage("Calculating the modulus of");
            case "log":
                return LanguageFactory.getMessage("Calculating the logarithm of: ");
            case "^":
                return LanguageFactory.getMessage("Raising");
            case "sqrt":
                return LanguageFactory.getMessage("Calculating the square root of: ");
            default:
                return "Realizando operación";
        }
    }
}
