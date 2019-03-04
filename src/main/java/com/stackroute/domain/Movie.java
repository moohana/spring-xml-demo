package com.stackroute.domain;

public class Movie {
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
    public  void display()
    {
        System.out.println(actor);
    }


}
