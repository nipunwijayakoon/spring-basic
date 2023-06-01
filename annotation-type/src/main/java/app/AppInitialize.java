package app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;

public class AppInitialize {
    public static void main(String[] args) {

 ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Course fullstackCourse =
                classPathXmlApplicationContext.getBean("fullStackCourse", Course.class);
        System.out.println(fullstackCourse.getProgramName());
        System.out.println(fullstackCourse.calculateCost());


        Course fullstackCourse2 =
                classPathXmlApplicationContext.getBean("fullStackCourse", Course.class);


        System.out.println(fullstackCourse==fullstackCourse2);




    }
}
