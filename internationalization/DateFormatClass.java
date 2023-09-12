package internationalization;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class DateFormatClass {

    public static void main(String[] args) throws ParseException {
        DateFormat dateFormat1 = DateFormat.getDateInstance();
        DateFormat dateFormat2 = DateFormat.getInstance();
        DateFormat dateFormat3 = DateFormat.getDateInstance(DateFormat.FULL);
        DateFormat dateFormat4 = DateFormat.getDateInstance(DateFormat.LONG);
        DateFormat dateFormat5 = DateFormat.getDateInstance(DateFormat.MEDIUM);
        DateFormat dateFormat6 = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(dateFormat1.format(new Date()));
        System.out.println(dateFormat2.format(new Date()));
        System.out.println(dateFormat3.format(new Date()));
        System.out.println(dateFormat4.format(new Date()));
        System.out.println(dateFormat5.format(new Date()));
        System.out.println(dateFormat6.format(new Date()));


        DateFormat ukFormat = DateFormat.getDateInstance(DateFormat.FULL, Locale.UK);
        System.out.println(ukFormat.format(new Date()));

        DateFormat dateTimeInstance = DateFormat.getDateTimeInstance();
        System.out.println(dateTimeInstance.format(new Date()));

//        Date date = DateFormat.getDateInstance().parse(dateFormat6.format(new Date()));
//        System.out.println(date);
    }

}
