package com.demo.beans;

import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import javax.annotation.Priority;

@Component @Priority(3)
public class SpringBean1 implements MyInterface {
    public SpringBean1(){
        //System.out.println("SpringBean1");
    }

    public String toString(){
        return "Spring Bean 1";
    }


}