package org.annotation.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("annotation.stereotype.config.xml");
        SolidStateDrive ssd1 = ctx.getBean("ssd", SolidStateDrive.class);
        System.out.println(ssd1);
    }
}
