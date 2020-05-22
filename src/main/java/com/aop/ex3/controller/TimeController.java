package com.aop.ex3.controller;

import com.aop.ex3.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/")
public class TimeController {
    @Autowired
    private TimeService timeService;

    //http://localhost:8080/api/getDay
    @RequestMapping(path = "getDay", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    private String getDay() {
        return timeService.getDay();
    }

    //http://localhost:8080/api/getMonth
    @RequestMapping(path = "getMonth", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    private String getMonth() {
        return timeService.getMonth();
    }

    //http://localhost:8080/api/getYear
    @RequestMapping(path = "getYear", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    private String getYear() {
        return timeService.getYear();
    }
}
