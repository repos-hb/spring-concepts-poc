package com.hb.orderservice.prototypeinsingleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class Singleton {

//    @Autowired
//    private Prototype prototype;

//    public Prototype getPrototype() {
//        return prototype;
//    }
//
//    public void setPrototype(Prototype prototype) {
//        this.prototype = getInstance();
//    }

    /**
     * Spring overrides the method with a call to beanFactory.getBean(Prototype.class)
     */
    @Lookup
    public Prototype getInstance(){
        return null;
    }
}
