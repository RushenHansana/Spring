package org.rushen.beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class BeanfactoryApplication {

    public static void main(String[] args) {

        BeanFactory factory = new ClassPathXmlApplicationContext("bean-factory-demo.xml");

        Student student = (Student) factory.getBean("student");

        System.out.println(student);
    }

}
