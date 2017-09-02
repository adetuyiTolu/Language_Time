/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crevation.nglocaltime.hausa;

/**
 *
 * @author toluadetuyi
 */
import java.util.Date;
import java.util.Calendar;
import com.crevation.nglocaltime.Time;

public class Hausa implements Time{
    
    @Override
    public String getTime(Date time){
        return getTimeHour(time.getHours(), time.getMinutes());
        
    }
    @Override
      public String getTime(Calendar time){
        return getTimeHour(time.getTime().getHours(), time.getTime().getMinutes());
        
    }
    @Override
    public String getTime(String time){
        
        try{
            
        int hour=Integer.parseInt(time.split("\\:")[0]);
        int minute=Integer.parseInt(time.split("\\:")[1]);
        return getTimeHour(hour, minute);
        
        }catch(NumberFormatException e){
            return "Error parsing time";
        }
    }
    
    @Override
    public String getCurrentTime(){
        Date d=Calendar.getInstance().getTime();
       return getTimeHour(d.getHours(), d.getMinutes()); 
    }
    String getTimeHour(int hour,int minute){
        if(hour==0)hour=24;
        String yor_minute="";
        if(minute!=0)
        yor_minute=getMinute(minute);
        String yor_hour="";
        if(minute>30){
            yor_hour=getHour(hour+1);
        }else{
            yor_hour=getHour(hour);
        }
        return yor_hour+yor_minute;
    }
    String getHour(int hour){
        if(hour>12)
            return Constants.TIME_POINTER+getNumber(hour-12);
        else
            return Constants.TIME_POINTER+getNumber(hour);
    }
    String getMinute(int minute){
        String description=Constants.number30;
        if(minute==45){
            description=Constants.number45;
        }else if(minute>30){
            description=Constants.BEFORE_POINTER +getNumber(60-minute);
        }else if(minute==15){
            description=Constants.number15;
        }else if(minute<30){
            description=Constants.AFTER_POINTER +getNumber(minute);
        }
        return description;
    }
    String getNumber(int number){
    switch(number){
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
        default:
            return "";
    }
    }
}
