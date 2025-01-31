package de.telran.springbeanexample;

import de.telran.springbeanexample.beans.Language;
import de.telran.springbeanexample.beans.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBeanExampleApplication {

    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppContext.class);
        ConfigurableApplicationContext context = SpringApplication.run(AppContext.class, args);
        Language french = (Language)context.getBean("french"); // bean
        System.out.println(french);

//        Language german = (Language)context.getBean("german"); // bean
//        System.out.println(german);

        Logger logger = (Logger) context.getBean("logger"); // bean
        logger.logMessage("some message");

//        Logger logger2 = new AppContext().logger(); // POJO
//        Language logger2Language = logger2.getLanguage(); // POJO

//        System.out.println(french == logger2Language);

        context.close();
        context.getBean("german"); // exception
    }

}
