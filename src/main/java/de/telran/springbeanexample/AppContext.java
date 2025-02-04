package de.telran.springbeanexample;

import de.telran.springbeanexample.beans.Language;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "de.telran.springbeanexample.beans")
@PropertySource("classpath:application.properties")
//@SpringBootApplication
public class AppContext {

    @Bean(name = "french")
    public Language french(){
        return new Language("French", "FR");
    }

    @Bean(name = "german")
    public Language german(){
        return new Language("German", "GE");
    }

//    @Bean
//    public Logger logger() {
//        return new Logger(french());
//    }




}
