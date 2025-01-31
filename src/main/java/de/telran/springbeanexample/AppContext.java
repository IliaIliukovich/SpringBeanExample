package de.telran.springbeanexample;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "de.telran.springbeanexample.beans")
//@SpringBootApplication
public class AppContext {

//    @Bean
//    public Language french(){
//        return new Language("French", "FR");
//    }
//
//    @Bean
//    public Language german(){
//        return new Language("German", "GE");
//    }
//
//    @Bean
//    public Logger logger() {
//        return new Logger(french());
//    }




}
