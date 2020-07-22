package org.rawin.config;

import io.quarkus.arc.config.ConfigProperties;

@ConfigProperties(prefix = "hello")
public class HelloConfig {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    
}