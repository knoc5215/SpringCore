package me.jumen.demospring51.autoWired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    /* field 주입 */
    @Autowired
    BookRepository bookRepository;

    /* 생성자 주입 */
    /*@Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }*/

    /* setter 주입 */
/*//@Autowired(required = false) required 기본값은 true. false로 두면 @Repository 등록을 하지 않아도 실행 가능
    @Autowired(required = true)
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }*/



}
