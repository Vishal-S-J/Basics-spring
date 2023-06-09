package org.springcore;

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
        org.springcore.Student student1 = (Student)context.getBean("student1");
        System.out.println(student1);

        //=====================================================================================

        context = new ClassPathXmlApplicationContext("2propValue.xml");
        student1 = (Student)context.getBean("student1");
        System.out.println(student1);

        //=====================================================================================

        context = new ClassPathXmlApplicationContext("3pschema.xml");
        student1 = (Student)context.getBean("student1");
        System.out.println(student1);

        //=====================================================================================

        context = new ClassPathXmlApplicationContext("4collections.xml");
        student1 = context.getBean("student1", Student.class);
        System.out.println(student1);

        //=====================================================================================

        context = new ClassPathXmlApplicationContext("5refobj.xml");
        HOD hod = context.getBean("hod", HOD.class);
        System.out.println(hod);
    }
}
