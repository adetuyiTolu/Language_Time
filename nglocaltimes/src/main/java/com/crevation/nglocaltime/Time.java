/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crevation.nglocaltime;

import java.util.Calendar;
import java.util.Date;

/**
 * @author toluadetuyi
 */
public interface Time {


    /**
     * This method returns equivalent time in local language
     *
     * @param time
     * @return String
     */
    String getTime(Date time);


    /**
     * This method returns equivalent time in local language
     *
     * @param time
     * @return String
     */
    String getTime(Calendar time);


    /**
     * This method returns equivalent time in local language
     *
     * @param time
     * @return String
     */
    String getTime(String time) throws NumberFormatException, ArrayIndexOutOfBoundsException;


    /**
     * This method returns current time in local language
     *
     * @return String
     */
    String getCurrentTime();

}
