package org.lifecycle.methods;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("lifecycle.methods.config.xml");

        Samosa s1 = (Samosa) ctx.getBean("s1");
        System.out.println(s1);
    }
}
