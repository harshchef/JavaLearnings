package com.example.learnspring;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class helloworld {
    public static void main(String[] args) {
        // Initialize the Spring context with the helloworldconfig class
        var context = new AnnotationConfigApplicationContext(helloworldconfig.class);

        // Retrieve and print the age bean
        System.out.println(context.getBean("age"));

        // Retrieve and print the name bean
        System.out.println(context.getBean("name"));

        // Retrieve and print the person2 bean
        System.out.println(context.getBean("person2"));

        // Retrieve and print the getPersonmethodcall bean
        System.out.println(context.getBean("getPersonmethodcall"));

        // Retrieve and print the get3para bean using parameters from the context
        String name = context.getBean("name", String.class);
        int age = context.getBean("age", Integer.class);
        Address address = context.getBean(Address.class);
        Person personFromParams = context.getBean(helloworldconfig.class).get3para(name, age, address);
        System.out.println(personFromParams);

        // Retrieve and print the Address bean (Primary bean)
        System.out.println(context.getBean(Address.class));

        // Retrieve and print the Address bean with qualifier address3quali
        System.out.println(context.getBean("add3"));

        // Retrieve and print the Person bean using the qualified Address bean
        System.out.println(context.getBean("getPersonWithQualifiedAddress"));

        // List all bean definitions in the context
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        // Close the context
        context.close();
    }
}
