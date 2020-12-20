package me.jumen.demospring51.ConverterFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {
    @Autowired
    ConversionService conversionService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
//      SpringBoot 클래스이다
//      WebConversionService extends DefaultFormattingConversionService
        System.out.println(conversionService);  //  등록된 formatter 출력
        System.out.println(conversionService.getClass().toString());
    }
}
