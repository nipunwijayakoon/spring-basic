package com.dev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext(BeanConfig.class);

        Vehicle mb = c.getBean("bmw",Vehicle.class);
        System.out.println(mb.getSpeed());
        System.out.println(mb.getCapacity());


        Bmw mb2 = c.getBean("bmw",Bmw.class);
        System.out.println(mb2.getCode());
    }
}
