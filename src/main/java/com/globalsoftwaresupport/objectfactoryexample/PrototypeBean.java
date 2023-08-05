package com.globalsoftwaresupport.objectfactoryexample;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeBean {
    private String s;

    public PrototypeBean() {
        System.out.println("Prototype bean created.");
        this.s = new Date().toString();
    }

    public String get() {
        return this.s;
    }
}
