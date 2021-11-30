package com.jhoncout.Aula33.controller;

import com.jhoncout.Aula33.model.Time;
import com.jhoncout.Aula33.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("time")
public class TimeController {

    @Autowired
    private TimeService service;

    @PostMapping
    public Time createTime(@RequestBody Time time){
        return service.createTime(time);
    }
}
