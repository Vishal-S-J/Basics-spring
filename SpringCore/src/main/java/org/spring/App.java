package org.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("1config.xml");
        org.springcore.Student student1 = (org.springcore.Student)context.getBean("student1");
        System.out.println(student1);
    }
}
