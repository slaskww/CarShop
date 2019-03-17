package i18n;

import java.util.*;

public class I18NSample {

    static public void main(String[] args) {

        String language;
        String country;

        if (true) {
            language = new String("en");
            country = new String("US");
        } else {
            language = new String("pl");
            country = new String("PL");
        }

        Locale currentLocale;
        ResourceBundle messages;

        currentLocale = new Locale("pl", "PL");

        messages =
                ResourceBundle.getBundle("Bundle",currentLocale);

        System.out.println(messages.getString("greetings"));
        System.out.println(messages.getString("inquiry"));
        System.out.println(messages.getString("farewell"));
    }
}