package com.github.sergio5990.spring.part3;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        final ServiceImpl bean = context.getBean(ServiceImpl.class);
        bean.exec();
    }
}