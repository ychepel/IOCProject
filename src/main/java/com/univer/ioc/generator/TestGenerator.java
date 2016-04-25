package com.univer.ioc.generator;

import org.springframework.stereotype.Component;

@Component
public class TestGenerator implements Generator {

    public String generate() {
        return "Abcdefg";
    }
}
