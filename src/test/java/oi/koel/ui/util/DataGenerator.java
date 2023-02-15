package oi.koel.ui.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataGenerator {

    public String dataGenerator(){
        String email = "Alex" + new SimpleDateFormat("yyyyMMdd_HHmmss")
                .format(new Date())+"@gmail.com";
        return email;
    }
}
