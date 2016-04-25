package com.univer.ioc;

import com.univer.ioc.transformer.CapitalizeTransformer;
import com.univer.ioc.transformer.Transformer;
import com.univer.ioc.transformer.UpperCaseTransformer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Transformer currentTransformer;
        if(Math.random() > 0.5) {
            currentTransformer = context.getBean(CapitalizeTransformer.class);
        }
        else {
            currentTransformer = context.getBean(UpperCaseTransformer.class);
        }
        System.out.println(currentTransformer.transform());
    }
}
