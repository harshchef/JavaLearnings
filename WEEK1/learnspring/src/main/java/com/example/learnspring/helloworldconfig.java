package com.example.learnspring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// Define a record for Address with city and street fields
record Address(String city, String street) {}

// Define a record for Person with name, age, and Address fields
record Person(String name, int age, Address address) {}

@Configuration
public class helloworldconfig {

    // Bean method to provide a String bean named "name"
    @Bean
    public String name() {
        return "ranga";
    }

    // Bean method to provide an int bean named "age"
    @Bean
    public int age() {
        return 11;
    }

    // Bean method to provide a Person bean named "person2"
    @Bean(name = "person2")
    public Person getPerson() {
        return new Person("adi", 11, new Address("london", "baker st"));
    }

    // Bean method to provide a Person bean named "getPersonmethodcall"
    // It uses the previously defined "name()" and "age()" methods and "getAddr()" bean
    @Bean
    public Person getPersonmethodcall() {
        return new Person(name(), age(), getAddr());
    }

    // Bean method to provide a Person bean with three parameters
    // It requires the parameters "name", "age", and "address" to create a Person object
    @Bean
    public Person get3para(String name, int age, Address address) {
        return new Person(name, age, address);
    }

    // Primary bean method to provide an Address bean named "add2"
    // It is marked as @Primary, meaning it is the primary bean for the Address type
    @Bean(name = "add2")
    @Primary
    public Address getAddr() {
        return new Address("india", "pak st");
    }

    // Bean method to provide an Address bean named "address"
    @Bean(name = "address")
    public Address getaddress() {
        return new Address("london", "baker st");
    }

    // Bean method to provide an Address bean named "add3"
    // It is qualified with "address3quali"
    @Bean(name = "add3")
    @Qualifier("address3quali")
    public Address getAddr3() {
        return new Address("nepal", "katman st");
    }

    // Bean method to provide a Person bean using the qualified Address bean "address3quali"
    @Bean
    public Person getPersonWithQualifiedAddress(@Qualifier("address3quali") Address address) {
        return new Person("qualifiedPerson", 22, address);
    }
}
