package edu.yisus.reto10.Idiomas;

public class Español implements Language{

    @Override
    public String getMessage(String key) {
        switch (key) {
            case "welcome":
                return "\t¡Bienvenido a la calculadora!";
            case "choice_option":
                return "Selecciona una de las anteriores opciones";
            case "menu":
                return "Menú\n1. Suma\n2. Resta\n3. Multiplicación\n4. División\n5. Potencia\n6. Raiz Cuadrada\n7. Logaritmo\n8. Modulo\n9. Salir";
            case "invalid_option":
                return "Opción invalida. Por favor, vuelva a intentarlo";
            case "enter_first_operand":
                return "Ingrese el primer operando: ";
            case "enter_second_operand":
                return "Ingrese el segundo operando: ";
            case "enter_first_multiple":
                return "Ingrese el primer múltiplo: ";
            case "enter_second_multiple":
                return "Ingrese el segundo múltiplo: ";
            case "enter_dividend":
                return "Ingresa el dividendo: ";
            case "enter_divisor":
                return "Ingresa el divisor: ";
            case "enter_base":
                return "Ingresa la base: ";
            case "enter_exponent":
                return "Ingresa el exponente: ";
            case "enter_index":
                return "Ingresa el índice de la raiz: ";
            case "enter_filing":
                return "Ingresa el radicando de la raiz: ";
            case "enter_logarithmBase":
                return "Ingrese la base del logaritmo: ";
            case "enter_argument":
                return "Ingrese el argumento: ";
            case "enter_moduloDividend":
                return "Ingresa el dividendo para el módulo: ";
            case "enter_moduloDivisor":
                return "Ingresa el divisor para el módulo: ";
            case "exit_menu":
                return "Gracias por utilizar la calculadora\n¡Tenga un buen día!";
            case "continue":
                return "¿Desea hacer otra operación? (y/n)";
            case "description_operation":
                return "Operación: ";
            case "is":
                return " es ";
            case "Adding":
                return "Suma ";
            case "Subtracting":
                return "Resta ";
            case "multiplication":
                return "multiplicación ";
            case "Dividing":
                return "Divvisión ";
            case "Calculating the modulus of ":
                return "EL modulo de ";
            case "Calculating the logarithm of":
                return "El logartimo de ";
            case "Raising":
                return "La potencia de ";
            case "Calculating the square root of":
                return "La raiz cuadrada de ";
            case "result":
                return "La operación es: ";
            default:
                return "Mensaje no encontrado";
        }
    }
}
