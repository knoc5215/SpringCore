package me.jumen.demospring51.propertyEditor;

import java.beans.PropertyEditorSupport;

//@Component thread-safe 하지 않기때문에, 절대로 singleton scope bean으로 등록해서 쓰면 안됀다 --> thread scope로는 가능
// 스프링 3.0 이전까지 DataBinder가 변환 작업 사용하던 인터페이스
public class EventEditor extends PropertyEditorSupport {
    @Override
    public String getAsText() {
        Event event = (Event) getValue();
        return event.getId().toString();
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(new Event(Integer.parseInt(text)));
    }

    /*
    getValue(), setValue()는 PropertyEditorSupport가 갖고 있다
    스레드끼리 공유가 된다
    statefull하다
    thread-safe 하지 않다
     */
}
