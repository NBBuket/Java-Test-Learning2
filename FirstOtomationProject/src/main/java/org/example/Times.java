package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Times {

    //function for general times and patterns
    public void getTime(String pattern, String time) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date date = simpleDateFormat.parse(time);
        System.out.println(date);
    }

}
