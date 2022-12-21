package org.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("autowire.config.xml");

        Employee e = ctx.getBean("employee", Employee.class);
        Employee e2 = ctx.getBean("employee2", Employee.class);
        System.out.println(e);
        System.out.println(e2);
    }
}
