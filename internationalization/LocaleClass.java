package internationalization;

import java.util.Arrays;
import java.util.Locale;

public class LocaleClass {

    public static void main(String[] args) {
//        Locale locale = new Locale(Locale.US);
        Locale defaultLocale = Locale.getDefault();
        System.out.println(defaultLocale.getCountry());
        System.out.println(defaultLocale.getDisplayCountry());
        System.out.println(defaultLocale.getLanguage());
        System.out.println(defaultLocale.getDisplayLanguage());
        String[] isoLanguages = Locale.getISOLanguages();
        System.out.println(Arrays.toString(isoLanguages));
        String[] isoCountries = Locale.getISOCountries();
        System.out.println(Arrays.toString(isoCountries));
        Locale[] availableLocales = Locale.getAvailableLocales();
        for (Locale locale : availableLocales) {
            System.out.println(locale.getDisplayCountry() + " ----> " + locale.getDisplayLanguage());
        }
        Locale locale = new Locale("bn", "BD");
        System.out.println(locale.getDisplayCountry());
        System.out.println(locale.getDisplayLanguage());




    }
}
