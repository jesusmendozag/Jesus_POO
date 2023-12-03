package edu.yisus.RetoFinal.UI.Languages;

public class LanguagesFactory {
    private static Languages language;

    /**
     * SELECCIONA EL IDIOMA SEGÚN LA OPCIÓN PROPORCIONADA.
     * @param languageOption La opción que representa el idioma deseado.
     */
    public static void selectLanguage(int languageOption){
        switch (languageOption){
            case 1:
                language = new English();
                break;
            case 2:
                language = new Spanish();
                break;
            case 3:
                language = new Japanese();
                break;
            default:
                System.out.println("Invalid choice. Defaulting to English.");
                language = new English();
        }
    }
    /**
     * Obtiene un mensaje o traducción en el idioma configurado según la clave proporcionada.
     * @param key La clave que identifica el mensaje o traducción.
     * @return El mensaje o traducción en el idioma configurado correspondiente a la clave especificada.
     */
    public static String getMessage(String key) {
        if (language != null) {
            return language.getMessage(key);
        }
        return "Language not configured";
    }
}