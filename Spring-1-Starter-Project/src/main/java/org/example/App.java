package org.example;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws BeansException {
        ApplicationContext context = new FileSystemXmlApplicationContext("index.xml");
        Student student = context.getBean("studentBean", Student.class);
        System.out.println(student);
    }
}
