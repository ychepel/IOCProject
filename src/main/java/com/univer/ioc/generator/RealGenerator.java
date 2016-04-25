package com.univer.ioc.generator;

import org.springframework.stereotype.Component;

@Component
public class RealGenerator implements Generator {

    public String generate() {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < 10; i++) {
            builder.append((char)(Math.random() * 26 + 97));
        }
        return builder.toString();
    }
}
