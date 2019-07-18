package com.myspringcloud.controller;

import com.myspringcloud.service.ribbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mzx on 2019/7/17.
 */
@RestController
public class HelloControler {

    @Autowired
    ribbonService ribbonService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name2) {
        return ribbonService.hiService( name2 );
    }

}
