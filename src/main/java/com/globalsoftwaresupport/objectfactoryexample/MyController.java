package com.globalsoftwaresupport.objectfactoryexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private SingletonBean bean;

    @GetMapping("/api")
    public void getMethod() throws InterruptedException {
        System.out.println(bean.get());
        Thread.sleep(5000);
        System.out.println(bean.get());
    }
}
