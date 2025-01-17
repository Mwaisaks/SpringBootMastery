package com.mwaisaka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml"); //creates the container
        //Dev obj = (Dev) context.getBean("Dev");
        //obj.build();
    }
}
