package com.amey;

import com.amey.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {

        /*JAVA BASED CONFIG*/
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        // Desktop desktop = context.getBean(Desktop.class);

        // USING BEAN NAME (BY DEFAULT - FUNCTION NAME)
        // Desktop desktop = context.getBean(Desktop.class);
        // desktop.compile();
        // Desktop desktop1 = context.getBean(Desktop.class);
        // desktop1.compile();

        Alien obj = context.getBean(Alien.class); // TYPE CASTING
        // obj.setAge(22);
        obj.code();


        /*XML BASED CONFIG*/
//        // SPRING OBJECT CREATION CODE
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Alien obj = (Alien) context.getBean("alien"); // TYPE CASTING
//        // obj.setAge(22);
//        System.out.println(obj.getAge());
//        obj.code();
//
//        // Alien obj2 = (Alien) context.getBean("alien"); // TYPE CASTING
//        // obj2.code();
//
//        // Calling by type
//        Desktop desk = context.getBean(Desktop.class);
    }
}
