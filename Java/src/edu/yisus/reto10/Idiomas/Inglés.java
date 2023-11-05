package edu.yisus.reto10.Idiomas;

public class Inglés implements Language{
    @Override
    public String getMessage(String key) {
        switch (key) {
            case "welcome":
                return "\t¡Welcome to the calculator!";
            case "choice_option":
                return "Select one of the following options:";
            case "menu":
                return "Menu\n1. Addition\n2. To subtract\n3. Multiplication\n4. Division\n5. Power (to the power of n)\n6. Square root\n7. Logarithm\n8. Module\n9. Exit";
            case "invalid_option":
                return "Invalid option. Please, try again";
            case "enter_first_operand":
                return "Enter the first operand: ";
            case "enter_second_operand":
                return "Enter the second operand: ";
            case "enter_first_multiple":
                return "Enter the first multiple: ";
            case "enter_second_multiple":
                return "Enter the second multiple: ";
            case "enter_dividend":
                return "Enter the dividend: ";
            case "enter_divisor":
                return "Enter the divisor: ";
            case "enter_base":
                return "Enter the base: ";
            case "enter_exponent":
                return "Enter the exponent: ";
            case "enter_index":
                return "Enter the root index: ";
            case "enter_filing":
                return "Enter the root radind: ";
            case "enter_logarithmBase":
                return "Enter the base of the logarithm: ";
            case "enter_argument":
                return "Enter the argument: ";
            case "enter_moduloDividend":
                return "Enter the dividend for the module: ";
            case "enter_moduloDivisor":
                return "Enter the divisor for the module: ";
            case "exit_menu":
                return "Thanks for using the calculator\n¡Have a nice day!";
            case "continue":
                return "Do you want to do another operation? (y/n)";
            case "description_operation":
                return "Operation: ";
            case "is":
                return " is ";
            case "Adding":
                return "Adding ";
            case "Subtracting":
                return "Subtracting ";
            case "multiplication":
                return "multiplication ";
            case "Dividing":
                return "Division ";
            case "Calculating the modulus of ":
                return "Calculating the modulus of ";
            case "Calculating the logarithm of":
                return "Calculating the logarithm of ";
            case "Raising":
                return "Raising ";
            case "Calculating the square root of":
                return "Calculating the square root of ";
            case "result":
                return "the operation is: ";
            default:
                return "Message not found";
        }
    }
}
