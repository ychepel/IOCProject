package com.univer.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Generator {
    public String generate() {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < 10; i++) {
            builder.append((char)(Math.random() * 26 + 97));
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        CapitalizeTransformer transformer = context.getBean(CapitalizeTransformer.class);
        System.out.println(transformer.getValue());
    }
}
