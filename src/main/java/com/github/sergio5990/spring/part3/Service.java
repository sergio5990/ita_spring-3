package com.github.sergio5990.spring.part3;

public class Service {

    private Dao dao;

    public Service() {
    }

    public Service(Dao dao) {
        this.dao = dao;
    }

    public Dao getDao() {
        return dao;
    }

    public void setDao(Dao dao) {
        this.dao = dao;
    }

    public void exec(){
        dao.exec("Sergey");
    }

}
