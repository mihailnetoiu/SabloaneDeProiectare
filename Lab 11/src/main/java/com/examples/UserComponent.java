package com.examples;

import org.springframework.stereotype.Component;

@Component
public class UserComponent {
    private final PrototypeComponent prototypeComponent;
    private final SingletonComponent singletonComponent;

    public UserComponent(PrototypeComponent prototypeComponent, SingletonComponent singletonComponent) {
        this.prototypeComponent = prototypeComponent;
        this.singletonComponent = singletonComponent;
        System.out.println("ConsumerComponent = " + this);
        System.out.println("SingletonComponent = " + singletonComponent);
        System.out.println("PrototypeComponent = " + prototypeComponent);
        System.out.println();
    }

    public void use() {
        System.out.println("Inside use() method in " + this);
        System.out.println("SingletonComponent = " + singletonComponent);
        System.out.println("TransientComponent = " + prototypeComponent);
        System.out.println();
    }
}
