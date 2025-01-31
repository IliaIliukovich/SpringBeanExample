package de.telran.springbeanexample.beans;

import org.springframework.stereotype.Component;

@Component("french")
public class Language {

    private String name = "French";
    private String code = "FR";

    public Language(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public Language() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Language{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }

}
