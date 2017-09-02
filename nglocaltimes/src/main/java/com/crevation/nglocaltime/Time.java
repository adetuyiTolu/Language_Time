/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crevation.nglocaltime;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author toluadetuyi
 */
public interface Time {
    
    String getTime(Date time);
    String getTime(Calendar time);
    String getTime(String time);
    String getCurrentTime();
    
}
