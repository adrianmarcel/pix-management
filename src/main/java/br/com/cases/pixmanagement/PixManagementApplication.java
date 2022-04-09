package br.com.cases.pixmanagement;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@Slf4j
@SpringBootApplication
@ComponentScan("br.com.cases.pixmanagement")
public class PixManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(PixManagementApplication.class, args);
    }
}