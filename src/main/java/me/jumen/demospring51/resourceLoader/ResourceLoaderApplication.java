package me.jumen.demospring51.resourceLoader;

import me.jumen.demospring51.beanScope.BeanScopeApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ResourceLoaderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ResourceLoaderApplication.class, args);
    }
}
