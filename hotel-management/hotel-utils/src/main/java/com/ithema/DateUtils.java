package com.ithema;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    public static String showdate(Date date,String string){
        SimpleDateFormat simple=new SimpleDateFormat(string);
        String format = simple.format(date);
        return format;


    }
    public static Date showdate1(String str,String string) throws ParseException {
        SimpleDateFormat simple=new SimpleDateFormat(string);
        Date parse = simple.parse(str);
        return parse;


    }

}
