package me.jumen.demospring51.applicationContext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.awt.print.Book;

// XML 기반의 설정방식의 대안으로 등장한 JAVA 기반 설
@Configuration
public class ApplicationConfig {

    @Bean
    public BookRepository bookRepository() {
        return new BookRepository();
    }

    /*
        @Bean으로 등록되어 있다면, 굳이 아래처럼 의존성을 주입하지 않아도
        @Autowired를 찾아서 의존성을 주입해준다.
     */
    @Bean
    public BookService bookService(/*BookRepository bookRepository*/) {
        BookService bookService = new BookService();
        bookService.setBookRepository(bookRepository());    //1. 생성자를 호출해서 주입하는 방법
//      bookService.setBookRepository(bookRepository);  // 2. 매개변수를 통한 주입
        return bookService;
    }
}
