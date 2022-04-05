package ru.diasoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.retry.annotation.EnableRetry;
import ru.diasoft.service.Demo;


@EnableRetry
@EnableCaching
@SpringBootApplication
public class App {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(App.class, args);

        run.getBean(Demo.class).demo();

    }

}
