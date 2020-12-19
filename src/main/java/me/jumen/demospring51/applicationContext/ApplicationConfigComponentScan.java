package me.jumen.demospring51.applicationContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

//@ComponentScan(basePackages = "me.jumen.demospring51.applicationContext")   // Type Safety 문제
// ApplicationContextApplication.class가 존재하는 패키지를 기준으로 @Annotation을 찾아서 Bean으로 등록해라
@ComponentScan(basePackageClasses = ApplicationContextApplication.class)
public class ApplicationConfigComponentScan {
}
