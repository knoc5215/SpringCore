package me.jumen.demospring51.autoWired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * 해당 타입의 빈이 여러 개인 경우
 * 1. @Primary
 * 2. 모든 beans를 받는다
 * 3. @Qualifier
 * */
@Service
public class BookServiceAnother {

//    @Autowired
    // 2. 모든 beans를 받는다
//    List<BookRepositryInterface> bookRepositryInterfaces;

    @Autowired
//  @Qualifier("jumenBookRepository")   // 3. @Primary 대안으로 bean 이름으로 주입
    BookRepositryInterface bookRepositryInterface;

    @Autowired
    BookRepositryInterface jumenBookRepository; // bean 이름으로 찾을 수도 있다


    public void printBookRepositoryInterface() {
        System.out.println(bookRepositryInterface.getClass());
    }

    public void printBookRepositryInterfaces() {
//        this.bookRepositryInterfaces.forEach(System.out::println);
    }
}
