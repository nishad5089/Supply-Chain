package com.supplychian.supplychian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan("com.auth.data.entity")
@ComponentScan({"com.auth.service","com.supplychian.supplychian"})
@EnableJpaRepositories("com.auth.data.repo")
public class SupplychianApplication {

    public static void main(String[] args) {
        SpringApplication.run(SupplychianApplication.class, args);
    }

}
