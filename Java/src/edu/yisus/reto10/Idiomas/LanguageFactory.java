package edu.yisus.reto10.Idiomas;

public class LanguageFactory {
    private static Language language;

    public static void selectLanguage(int languageOption){
        switch (languageOption){
            case 1:
                language = new Inglés();
                break;
            case 2:
                language = new Español();
                break;
            case 3:
                language = new Japones();
                break;
            default:
                System.out.println(". Seleccionando español por defecto.");
                language = new Español();
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
        return "Idioma no configurado";
    }
}