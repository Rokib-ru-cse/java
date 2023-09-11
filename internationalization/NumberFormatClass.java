package internationalization;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatClass {


    public static void main(String[] args) throws ParseException {
        NumberFormat numberFormat1 = NumberFormat.getInstance();
        NumberFormat numberFormat2 = NumberFormat.getNumberInstance();
        NumberFormat numberFormat3 = NumberFormat.getCurrencyInstance();
        NumberFormat numberFormat4 = NumberFormat.getPercentInstance();
        String format1 = numberFormat1.format(123456789);
        String format2 = numberFormat1.format(123456789.12345678);
        System.out.println(format1);
        System.out.println(format2);

        Number number = numberFormat1.parse(format1);
        System.out.println(number);


        NumberFormat bdFormat = NumberFormat.getInstance(Locale.US);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String format = currency.format(123456.6543);
        System.out.println(format);

    }
}
