package gau.nau;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        // Example of inject by constructor
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld objA = (HelloWorld) context.getBean("helloWorldConstructor");
        objA.print();

        // Example of inject by setter
        HelloWorld objB = (HelloWorld) context.getBean("helloWorldSetter");
        objB.print();

    }

}