package com.angularUIIntegration.angularIntegration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @Autowired
    private UserRepository us;


    @RequestMapping(value = "/hello")
    public String index() {
        /*Employee e = new Employee();
        e.setName("nagendra");
        e.setAge(25);
        us.save(e);*/
        return "index";
    }
}