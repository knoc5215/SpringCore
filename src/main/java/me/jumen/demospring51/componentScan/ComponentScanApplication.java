package me.jumen.demospring51.componentScan;

import me.jumen.demospring51.autoWired.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

@SpringBootApplication
public class ComponentScanApplication {

    @Autowired
    BookService bookService;

    public static void main(String[] args) {
//        SpringApplication.run(ComponentScanApplication.class, args);

//        base-pakage가 다른 곳의 bean을 Functional하게 등록하는 방법
        var app = new SpringApplication(ComponentScanApplication.class);
        app.addInitializers((ApplicationContextInitializer<GenericApplicationContext>) ctx -> {
            ctx.registerBean(BookService.class);
            ctx.registerBean(BookRepository.class); // BookService 안에 BookRepository field가 있으므로 함께 등록해야 함
            ctx.registerBean(ApplicationRunner.class, () -> args1 -> System.out.println("AppRunner by functional"));
        });
        app.run(args);

    }


}
