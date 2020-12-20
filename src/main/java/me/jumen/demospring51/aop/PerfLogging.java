package me.jumen.demospring51.aop;

import java.lang.annotation.*;

/*
 * 이 어노테이션은 성능을 로깅한다.
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)   // 어노테이션 정보를 CLASS FILE에도 유지 (default)
public @interface PerfLogging {
}
