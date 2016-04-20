package com.univer.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpperCaseTransformer implements Transformer {
    private Generator generator;

    @Autowired
    public UpperCaseTransformer(Generator generator) {
        this.generator = generator;
    }

    public String getValue() {
        String before = generator.generate();
        String result = before.toUpperCase();
        return result;
    }
}
