package me.jumen.demospring51.resourceLoader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ResourceLoaderApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ResourceLoaderApplication.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run(args);
    }



}
