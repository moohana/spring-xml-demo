package com.stackroute.domain;


import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String args[]) {
        // XmlBeanFactory beanFactory=new   XmlBeanFactory(new ClassPathResource("beans.xml"));
        //Movie movie=(Movie) beanFactory.getBean("movie");
        //movie.display();
        //Application Context

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie = (Movie) context.getBean("movie");
        System.out.println(movie.getActor());
        Movie movie1 = (Movie) context.getBean("movie1");
        System.out.println(movie.getActor());
        System.out.println(movie1.equals(movie));

    }
}








