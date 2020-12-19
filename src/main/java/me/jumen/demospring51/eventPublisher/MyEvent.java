package me.jumen.demospring51.eventPublisher;

/*
4.2버전 이후부터는 ApplicationEvent를 extend 해야했지만 삭제되었다
--> 가장 깔끔한 POJO (Spring 소스가 없다)
--> POJO 기반의 프로그래밍
--> 스프링이 추가하는 철학
 */
public class MyEvent {
    private Object source;
    private int data;

    public Object getSource() {
        return source;
    }

    public int getData() {
        return data;
    }

    public MyEvent(Object source, int data) {
        this.source = source;
        this.data = data;
    }
}
