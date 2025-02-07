package de.telran.springbeanexample.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
//@Scope("prototype")
public class B {

//    @Autowired // field injection - not recommended
    private A a;

//    @Autowired // setter injection - in case when a is optional | can change a
    public void setA(A a) {
        this.a = a;
    }

    @Autowired // constructor injection - strong connection between a and b
    public B(@Qualifier(value = "a")A a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "B{" +
                "a=" + a +
                '}';
    }

    @PostConstruct
    public void init() {
        System.out.println("Initialization logic of " + this);
    }

    @PreDestroy
    public void finalActions() {
        System.out.println("Logic before context is closed " + this);

    }
}
