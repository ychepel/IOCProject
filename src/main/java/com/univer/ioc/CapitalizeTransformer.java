package com.univer.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CapitalizeTransformer implements Transformer {
    private Generator generator;

    @Autowired
    public CapitalizeTransformer(Generator generator) {
        this.generator = generator;
    }

    public String getValue() {
        String before = generator.generate();
        String result = before.substring(0, 1).toUpperCase() + before.substring(1);
        return result;
    }
}
