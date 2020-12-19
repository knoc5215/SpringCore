package me.jumen.demospring51.eventPublisher;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class EventPublisherApplication {
    public static void main(String[] args) {
        SpringApplication.run(EventPublisherApplication.class, args);
    }
}
