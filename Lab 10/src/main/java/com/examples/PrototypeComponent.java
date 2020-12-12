package com.examples;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

@Component
@Scope(value = SCOPE_PROTOTYPE)
public class PrototypeComponent {
    public PrototypeComponent() {
        System.out.println("PrototypeComponent = " + this);
        System.out.println();
    }

    public void operation() {
        System.out.println("Called operation() on " + this);
        System.out.println();
    }
}
