package com.myspringcloud.service;

import org.springframework.stereotype.Component;

/**
 * Created by mzx on 2019/7/17.
 */
@Component
public class SchedualServiceHiHystric implements  SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }


}
