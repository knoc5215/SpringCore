package me.jumen.demospring51.nullSafety;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
public class EventService {
    /*
        사용 목적 : 툴의 지원을 받아, 컴파일 시점에 최대한 NullPointerException을 방지하는 것
     */
    @NonNull
    public String createEvent(@NonNull String name) {
        return "hello " + name;
    }
}
