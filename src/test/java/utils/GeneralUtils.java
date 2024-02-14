package utils;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GeneralUtils {

    public static String getNowDate(String mask) {
        DateFormat dateFormat = new SimpleDateFormat(mask);
        Date date = new Date();
        return dateFormat.format(date);
    }
}
