package me.jumen.demospring51.eventPublisher;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener; // 더 이상 필요없음
import org.springframework.context.event.*;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MyEventHandler {
    @EventListener
    @Async  //비동기적으로 실행하고 싶다면
//    @Order(Ordered.HIGHEST_PRECEDENCE)  //핸들러 우선순위
    public void handle(MyEvent event) {
        System.out.println(Thread.currentThread().toString());
        System.out.println("이벤트 받았다. 데이터는 " + event.getData());
    }

    @EventListener
    @Async  //비동기적으로 실행하고 싶다면
    // ApplicationContext를 초기화 했더나 리프래시 했을 때 발생.
    public void handle(ContextRefreshedEvent event) {
        System.out.println(Thread.currentThread().toString());
        System.out.println("ContextRefreshedEvent");
//        ApplicationContext ctx = event.getApplicationContext();
    }

    @EventListener
    @Async  //비동기적으로 실행하고 싶다면
    // ApplicationContext를 start()하여 라이프사이클 빈들이 시작신호를 받은 시점에 발생.
    public void handle(ContextStartedEvent event) {
        System.out.println(Thread.currentThread().toString());
        System.out.println("ContextStartedEvent");
    }

    @EventListener
    @Async  //비동기적으로 실행하고 싶다면
    // ApplicationContext를 stop()하여 라이프사이클 빈들이 정지신호를 받은 시점에 발생.
    public void handle(ContextStoppedEvent event) {
        System.out.println(Thread.currentThread().toString());
        System.out.println("ContextStoppedEvent");
    }

    @EventListener
    @Async  //비동기적으로 실행하고 싶다면
    // ApplicationContext를 close()하여 싱글톤 빈 소멸되는 시점에 발생.
    public void handle(ContextClosedEvent event) {
        System.out.println(Thread.currentThread().toString());
        System.out.println("ContextClosedEvent");
    }

}
