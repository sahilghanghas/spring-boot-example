package com.springexample;

import com.springexample.model.Employee;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);
        Employee bean = context.getBean(Employee.class);
        System.out.println(bean);
    }

    @Bean
    public CommandLineRunner runner(ApplicationContext context) {
        return args -> {
            System.out.println("inspect beans");
            String []beanNames = context.getBeanDefinitionNames();
            for (String beans : beanNames) {
                System.out.println(beans);
            }
        };
    }

}
