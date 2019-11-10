package com.github.sergio5990.spring.part3;

import org.springframework.beans.factory.annotation.Autowired;

public class ServiceWiring {

    private Dao dao;

    public Dao getDao() {
        return dao;
    }

    @Autowired
//    @Autowired(required = false)
    public void setDao(Dao dao) {
        this.dao = dao;
    }

    public void exec(){
        dao.exec("Sergey");
    }
}
