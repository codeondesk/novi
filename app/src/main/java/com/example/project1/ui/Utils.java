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
}
