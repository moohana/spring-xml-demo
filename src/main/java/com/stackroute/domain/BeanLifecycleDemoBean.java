package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean
{
    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public void customInit() throws Exception {
        System.out.println("Init method after properties are set : " + message);
    }

    public void customDestroy() throws Exception {
        System.out.println("Spring Container is destroy! Customer clean up");
    }

}

