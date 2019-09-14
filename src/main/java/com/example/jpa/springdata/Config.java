package com.example.jpa.springdata;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.techprimers.jpa.springdatajpahibernateexample.resource")
@Configuration
public class Config {


}
