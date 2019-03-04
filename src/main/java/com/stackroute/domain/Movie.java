package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public   class Movie implements ApplicationContextAware,BeanFactoryAware {
    private  Actor actor;
    public Movie ()
    {
        super();
    }


    public Movie(Actor actor) {

        this.actor = actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }
    ApplicationContext context;
    public ApplicationContext getContext() {
        return context;
    }

    public void setApplicationContext(ApplicationContext context)
            throws BeansException {
        this.context=context;
    }

    BeanFactory beanFactory;


    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }


    public  void display()
    {
        System.out.println(actor);
    }


}
