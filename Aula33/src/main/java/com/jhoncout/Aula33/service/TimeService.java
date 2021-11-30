package com.jhoncout.Aula33.service;

import com.jhoncout.Aula33.model.Time;
import com.jhoncout.Aula33.repository.TimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TimeService {

    @Autowired
    private TimeRepository repository;

    public Time createTime(Time time){
        return repository.save(time);
    }
}
