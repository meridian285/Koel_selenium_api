package oi.koel.dataGenerator;

import io.qameta.allure.Step;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Класс генерации данных
 */
public class DataGenerator {
    //Метод генерации случайного адреса почты
    public String dataGenerator(){
        String email = "Alex" + new SimpleDateFormat("yyyyMMdd_HHmmss")
                .format(new Date())+"@gmail.com";
        return email;
    }
}
