package me.jumen.demospring51.ConverterFormatter;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        // add converter
//        registry.addConverter(new EventConverter.StringToEventConverter());
        // add formatter
//        registry.addFormatter(new EventFormatter());

        // ConversionService에 등록되어, 이를 사용한다
    }
}
