package com.github.sergio5990.spring.part3;

public class Dao2 implements IDao {

    @Override
    public void exec(String name) {
        System.out.println("my name: " + name);
    }
}
