package com.crevation.nglocaltime.efik;

import com.crevation.nglocaltime.Time;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by idee on 9/3/17.
 */

public class Efik implements Time {

    @Override
    public String getTime(Date time) {
        return getTimeHour(time.getHours(), time.getMinutes());
    }

    @Override
    public String getTime(Calendar time) {
        return getTimeHour(time.getTime().getHours(), time.getTime().getMinutes());
    }

    @Override
    public String getTime(String time) {
        try {
            int hour = Integer.parseInt(time.split("\\:")[0]);
            int minute = Integer.parseInt(time.split("\\:")[1]);
            return getTimeHour(hour, minute);
        } catch (NumberFormatException e) {
            return "incorrect input";
        } catch (ArrayIndexOutOfBoundsException aex) {
            return "incorrect input";
        }
    }

    @Override
    public String getCurrentTime() {
        Date d = Calendar.getInstance().getTime();
        return getTimeHour(d.getHours(), d.getMinutes());
    }

    private String getTimeHour(int hour, int minute) {

        if (hour == 0) hour = 24;
        String yor_minute = "";

        if (minute != 0)
            yor_minute = getMinute(minute);

        String yor_hour;

        if (minute > 30) {
            yor_hour = getHour(hour + 1);
        } else {
            yor_hour = getHour(hour);
        }

        if (minute == 0) {
            return Constants.OCLOCK + yor_hour;
        } else if (minute <= 30) {
            return yor_hour + " " + yor_minute;
        } else {
            return yor_minute + " " + getHour(hour);
        }

    }

    private String getHour(int hour) {

        if (hour > 12)
            return "Amia " + getNumber(hour - 12) + " ebe";
        else
            return "Amia " + getNumber(hour) + " ebe";


    }

    private String getMinute(int minute) {

        if (minute > 30) {
            return "Ayak minute " + getNumber(minute) + " ndi mia";
        }

        return "ke minute " + getNumber(minute);
    }

    private String getNumber(int number) {

        switch (number) {
            case 1:
                return Constants.number1;
            case 2:
                return Constants.number2;
            case 3:
                return Constants.number3;
            case 4:
                return Constants.number4;
            case 5:
                return Constants.number5;
            case 6:
                return Constants.number6;
            case 7:
                return Constants.number7;
            case 8:
                return Constants.number8;
            case 9:
                return Constants.number9;
            case 10:
                return Constants.number10;
            case 11:
                return Constants.number11;
            case 12:
                return Constants.number12;
            case 13:
                return Constants.number13;
            case 14:
                return Constants.number14;
            case 15:
                return Constants.number15;
            case 16:
                return Constants.number16;
            case 17:
                return Constants.number17;
            case 18:
                return Constants.number18;
            case 19:
                return Constants.number19;
            case 20:
                return Constants.number20;
            case 21:
                return Constants.number21;
            case 22:
                return Constants.number22;
            case 23:
                return Constants.number23;
            case 24:
                return Constants.number24;
            case 25:
                return Constants.number25;
            case 26:
                return Constants.number26;
            case 27:
                return Constants.number27;
            case 28:
                return Constants.number28;
            case 29:
                return Constants.number29;
            case 30:
                return Constants.number30;
            default:
                return "";

        }

    }

}
