package org.annotation.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("annotation.autowire.config.xml");

        Spreadsheet spreadsheet = ctx.getBean("spreadsheet", Spreadsheet.class);

        System.out.println(spreadsheet);
    }
}
