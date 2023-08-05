package com.globalsoftwaresupport.objectfactoryexample;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class SingletonBean {

    @Autowired
    private ObjectFactory<PrototypeBean> beanObjectFactory;

    public String get() {
        return this.beanObjectFactory.getObject().get();
    }
}
