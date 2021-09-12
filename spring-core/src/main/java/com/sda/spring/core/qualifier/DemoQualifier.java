package com.sda.spring.core.qualifier;

import com.sda.spring.core.config.scan.MyComponent;
import com.sda.spring.core.config.scan.ScanConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoQualifier {

    public static void main(String[] args) {
        ApplicationContext appContext =
                new AnnotationConfigApplicationContext(QualifierConfig.class);

        FormatterService formatterService = appContext.getBean("formatterService", FormatterService.class);
        formatterService.run();
    }
}
