package me.jumen.demospring51.autoWired;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary    // 1. 해당 타입의 빈이 여러 개인 경우, 우선순위를 부여해서 주입한다
public class JumenBookRepository implements BookRepositryInterface {
}
