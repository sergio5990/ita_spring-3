package com.github.sergio5990.spring.part3;

public class Dao implements IDao{

    @Override
    public void exec(String name) {
        System.out.println("my name: " + name);
    }
}
