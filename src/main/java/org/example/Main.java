package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
        Student stud = context.getBean("student", Student.class);
        stud.displayStudent();

        Student ram = context.getBean("Ram", Student.class);
        ram.displayStudent();
        System.out.println("Hello world!");
    }
}