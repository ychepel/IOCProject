package com.univer.ioc.transformer;

import com.univer.ioc.generator.Generator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UpperCaseTransformer implements Transformer {
    private Generator generator;

    @Autowired
    public UpperCaseTransformer(@Qualifier("realGenerator") Generator generator) {
        this.generator = generator;
    }

    public String transform() {
        String before = generator.generate();
        String result = before.toUpperCase();
        return result;
    }
}
