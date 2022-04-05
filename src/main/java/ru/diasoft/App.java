package ru.diasoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.diasoft.rest.api.BookApi;
import ru.diasoft.service.Demo;

@SpringBootApplication
public class App {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(App.class, args);

        run.getBean(Demo.class).demo();

    }

}
