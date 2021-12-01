package com.example.project1.ui;

import androidx.annotation.Nullable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Utils {

    public static @Nullable Date toDate(String dateStr, String patern) {
        SimpleDateFormat format = new SimpleDateFormat(patern, Locale.US);
        try {
            return format.parse(dateStr);
        } catch (ParseException e) {
           return null;
        }
    }

    public static String toString(Date date, String patern) {
        SimpleDateFormat format = new SimpleDateFormat(patern, Locale.US);
        return format.format(date);
    }


    public static String correctdateformer(String former){

        Date createDate = Utils.toDate(former, "HH:mm:ss.SSSSSSS");
        if(createDate!=null){
            String formatedCreatedDate = Utils.toString(createDate, "HH:mm:ss");
            return formatedCreatedDate;
        }else{
            createDate = Utils.toDate(former, "SSSSSSSS.HH:mm:ss.SSSSSSS");
            String formatedCreatedDate = Utils.toString(createDate, "HH:mm:ss");
            return formatedCreatedDate;
        }



    }




}
