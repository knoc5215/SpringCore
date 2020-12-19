package me.jumen.demospring51.autoWired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class BookServiceAnotherRunner implements ApplicationRunner {
    @Autowired
    BookServiceAnother bookServiceAnother;

    @Override
    public void run(ApplicationArguments args) throws Exception {
//      bookServiceAnother.printBookRepositoryInterface();
        bookServiceAnother.printBookRepositryInterfaces();  // 2. 모든 beans를 받는다
    }
}
