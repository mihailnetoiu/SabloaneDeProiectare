package com;

import com.examples.PrototypeComponent;
import com.examples.SingletonComponent;
import com.examples.UserComponent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = "com")
public class MainApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MainApplication.class, args);

        // First prototype bean
        PrototypeComponent prototypeBean = context.getBean(PrototypeComponent.class);
        prototypeBean.operation();

        // Different prototype bean
        prototypeBean = context.getBean(PrototypeComponent.class);
        prototypeBean.operation();

        // First singleton bean
        SingletonComponent singletonBean = context.getBean(SingletonComponent.class);
        singletonBean.operation();

        // Same singleton bean
        singletonBean = context.getBean(SingletonComponent.class);
        singletonBean.operation();

        // First user singleton bean
        UserComponent user = context.getBean(UserComponent.class);
        user.use();

        // Same user singleton bean
        user = context.getBean("userComponent", UserComponent.class);
        user.use();
    }

}
