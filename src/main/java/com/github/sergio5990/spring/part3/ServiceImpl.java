package com.github.sergio5990.spring.part3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.Resource;

public class ServiceImpl {

    private IDao dao;

    @Resource(name = "dao-2")
//    @Resource
    private IDao dao2;

    public IDao getDao() {
        return dao;
    }

    @Autowired
    @Qualifier("dao-1")
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    public void exec(){
        dao.exec("Sergey");
    }
}
