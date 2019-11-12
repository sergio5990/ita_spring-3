package com.github.sergio5990.spring.part3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(JavaConfig.class)
public class JavaConfig2 {

    private JavaConfig javaConfig;

    public JavaConfig2(JavaConfig javaConfig) {
        this.javaConfig = javaConfig;
    }

    @Bean()
    public Service service() {
        return new Service(javaConfig.dao());
    }
}

