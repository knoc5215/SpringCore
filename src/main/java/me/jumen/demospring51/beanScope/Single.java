package me.jumen.demospring51.beanScope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
1. 모든 Singleton scope의 bean들은 기본값으로 ApplicationContext 구동 시점에 생성된다.
2. Singleton bean을 사용할때는 멀티 스레드 환경을 고려하자
 */
@Component
public class Single {

    /*
    Singleton bean에서 prototype bean을 참조한다?
    Singleton bean이 만들어질때, prototype field가 이미 셋팅되어 변경되지 않는다 -> 문제있
     */
    @Autowired
    private Proto proto;

    public Proto getProto() {
        return proto;
    }

/*
    @Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)의 대안으로 사용할 수 있는 것
    @Autowired
    private ObjectProvider<Proto> proto;
    public Proto getProto() {
        return proto.getIfAvailable();
    }
*/


}
