package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //here is ApplicationContext Interface //ClassPathXmlApplication is class
        ApplicationContext context=new ClassPathXmlApplicationContext("altaf.xml");
         //here is start your first bean class 
         Student student1=(Student) context.getBean("student1");
         System.out.println(student1);
         
      
         
           
        
    }
}
