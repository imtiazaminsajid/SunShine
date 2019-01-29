package com.example.ambit.sunshine.Common;

import android.location.Location;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class Common {

    public static final String API_ID = "eabe8de4211468c77e9dcda6150b0cda";
    public static Location current_location = null;

    public static String convertUnixToDate(long dt) {
        Date date = new Date(dt*1000L);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm dd aaa  |  DD EEE MM yyyy");
        String formatted = simpleDateFormat.format(date);

        return formatted;
    }

    public static String convertUnixToHour(long sunrise) {

        Date date = new Date(sunrise*1000L);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm aaa");
        String formatted = simpleDateFormat.format(date);

        return formatted;
    }
}
