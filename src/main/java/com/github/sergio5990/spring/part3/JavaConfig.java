package com.github.sergio5990.spring.part3;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
public class JavaConfig {

    @Bean("dao-3")
    @Order(1)
    public Dao dao() {
        return new Dao();
    }

    @Bean("dao2")
    public Dao dao2() {
        return new Dao();
    }
}
