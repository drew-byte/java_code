package main;

import domain.FlavoredMilkTea;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MilkTeaApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        FlavoredMilkTea fmt = context.getBean("flavoredMilkTea", FlavoredMilkTea.class);

        System.out.println(fmt);
        context.close();
    }
}