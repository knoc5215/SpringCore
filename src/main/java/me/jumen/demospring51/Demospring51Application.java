package me.jumen.demospring51;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;


@SpringBootApplication
public class Demospring51Application {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Demospring51Application.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run(args);
//        org.springframework.boot.SpringApplication.run(Demospring51Application.class, args);
    }



}
