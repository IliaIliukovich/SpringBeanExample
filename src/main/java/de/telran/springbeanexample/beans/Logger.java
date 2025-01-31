package de.telran.springbeanexample.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Logger {

    @Autowired
    private Language language;

    public Logger() {
    }

    public Logger(Language language) {
        this.language = language;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public void logMessage(String string) {
        System.out.println("Logging message in " + language.getName() + ": " + string);
    }
}
