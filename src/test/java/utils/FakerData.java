package utils;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class FakerData {

    static Faker faker = new Faker(Locale.forLanguageTag("pt-BR"));

    public static String returnFakerFormatDate(){
        Date movementFakeDate = faker.date().past(20, TimeUnit.DAYS);
        return simpleDataFormat().format(movementFakeDate);

    }

    public static Integer returnFakerValue(){
        return faker.number().numberBetween(1000, 6000);
    }

    public static SimpleDateFormat simpleDataFormat(){
        return new SimpleDateFormat("dd/MM/yyyy");
    }

    public static String fakerFullName(){
        return faker.name().fullName();
    }

    public static String fakerEmail(){
        return faker.internet().emailAddress();
    }

    public static String fakerPassword(){
        return faker.internet().password();
    }
}
