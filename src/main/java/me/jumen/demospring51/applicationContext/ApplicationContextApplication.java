package me.jumen.demospring51.applicationContext;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/*
    3. @SpringBootApplication 안에 이미 @ComponentScan과 @Configuration이 존재한다
    이 자체가 사실상 설정파일이다
 */
@SpringBootApplication
public class ApplicationContextApplication {

    public static void main(String[] args) {
        // 3. JAVA @Configuration 기반 + @ComponentScan bean 설정
        // 현재 Spring Boot의 동작 방식
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfigComponentScan.class);

        // 2. JAVA @Configuration 기반 bean 설정 (AnnotationConfigApplicationContext)
//      ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        // 1. XML 기반 bean 설정 (ClassPathXmlApplicationContext)
//      ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        System.out.println(Arrays.toString(beanDefinitionNames));

        BookService bookService = (BookService) applicationContext.getBean("bookService");
        System.out.println(bookService.bookRepository != null);
    }


}
