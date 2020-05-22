package com.aop.ex3.service;

import com.aop.ex3.annotation.Remember;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class TimeService {

    /**
     * Returns the current date as dd-MM-yyyy
     * Example: 22-05-2020
     */
    @Remember
    public String getDay() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        return formatter.format(new Date());
    }

    /**
     * Returns the current date as MM-yyyy
     * Example: 05-2020
     */
    @Remember
    public String getMonth() {
        SimpleDateFormat formatter = new SimpleDateFormat("MM-yyyy");
        return formatter.format(new Date());
    }

    /**
     * Returns the current date as yyyy
     * Example: 2020
     */
    @Remember
    public String getYear() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
        return formatter.format(new Date());
    }
}
