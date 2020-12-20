package me.jumen.demospring51.ConverterFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

/* 사용추천 */
@Component  // thread-safe
public class EventFormatter implements Formatter<Event> {

    @Autowired
    MessageSource messageSource;    // thread-safe하기에 사용가능

    @Override
    public Event parse(String text, Locale locale) throws ParseException {
        return new Event(Integer.parseInt(text));
    }

    @Override
    public String print(Event object, Locale locale) {
//        messageSource.getMessage("code", locale);
        return object.getId().toString();
    }
}
