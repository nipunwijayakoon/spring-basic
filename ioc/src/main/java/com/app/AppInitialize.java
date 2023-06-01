package com.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppInitialize {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

//        FullStackCourse fs = context.getBean("fullstack",FullStackCourse.class);
//
//        System.out.println(fs.getProgramName());
//
//        System.out.println(fs.getPrice());
//
//        System.out.println(fs.getDuration());


        FullStackCourse fs1 = context.getBean("fullstack",FullStackCourse.class);
        FullStackCourse fs2 = context.getBean("fullstack",FullStackCourse.class);
        System.out.println(fs1==fs2);
        System.out.println(fs1);
        System.out.println(fs2);
        context.close();

    }
}
