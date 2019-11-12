package com.github.sergio5990.spring.part3;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

class ServiceTest {

    @Test
    void byName() {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans-by-name.xml");
        final Service bean = context.getBean(Service.class);
        bean.exec();
    }

    @Test
    void byType() {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans-by-type.xml");
        final Service bean = context.getBean(Service.class);
        bean.exec();
    }

    @Test
    void byConstructor() {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans-by-constr.xml");
        final Service bean = context.getBean(Service.class);
        bean.exec();
    }

    @Test
    void byWiring() {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        final ServiceWiring bean = context.getBean(ServiceWiring.class);
        bean.exec();
    }

    @Test
    void byTwice() {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans-2.xml");
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);


        final ServiceImpl bean = context.getBean(ServiceImpl.class);
        bean.exec();
    }

    @Test
    void name() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(JavaConfig.class);
        context.refresh();

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }

    @Test
    void nameAnnot() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.");
        context.refresh();

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}