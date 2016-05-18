package com.capella;

import org.apache.camel.spring.Main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ramesh on 18/05/2016.
 */
public class App {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        AbstractXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/spring/camel-context.xml");
        main.setApplicationContext(applicationContext);
        main.run(args);
    }
}
