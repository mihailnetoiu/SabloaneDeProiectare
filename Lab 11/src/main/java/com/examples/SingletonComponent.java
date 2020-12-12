package com.examples;

import org.springframework.stereotype.Component;

@Component
public class SingletonComponent {

    public SingletonComponent() {
        System.out.println("SingletonComponent = " + this);
        System.out.println();
    }

    public void operation() {
        System.out.println("Called operation() on " + this);
        System.out.println();
    }
}

