package me.jumen.demospring51.beanScope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    ApplicationContext ctx;


    @Override
    public void run(ApplicationArguments args) throws Exception {
//      @Scope("prototype")
        System.out.println("proto");
        System.out.println(ctx.getBean(Proto.class));
        System.out.println(ctx.getBean(Proto.class));
        System.out.println(ctx.getBean(Proto.class));

        System.out.println("single");
        System.out.println(ctx.getBean(Single.class));
        System.out.println(ctx.getBean(Single.class));
        System.out.println(ctx.getBean(Single.class));

//      Singleton에서 prototype 참조할때, 값이 변경되지 않아서 문제가 있다
//      @Scope("prototype")일 경우 테스트
//      System.out.println("proto by single");
//      System.out.println(ctx.getBean(Single.class).getProto());
//      System.out.println(ctx.getBean(Single.class).getProto());
//      System.out.println(ctx.getBean(Single.class).getProto());

//      @Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS) 클래스 기반의 프록시
//      single이 proxy를 거쳐서 proto를 참조하면, 매번 다른 객체를 셋팅받을 수 있다.
        System.out.println("proto by single on proxyMode");
        System.out.println(ctx.getBean(Single.class).getProto());
        System.out.println(ctx.getBean(Single.class).getProto());
        System.out.println(ctx.getBean(Single.class).getProto());
    }
}
