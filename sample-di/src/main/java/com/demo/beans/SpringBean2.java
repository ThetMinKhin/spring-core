package com.demo.beans;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class SpringBean2 implements MyInterface, Ordered {
    public SpringBean2(){
        System.out.println("SpringBean2");
    }

    @Override
    public int getOrder() {
        return 2;
    }
    public String toString(){
        return "Spring Bean 2";
    }
}