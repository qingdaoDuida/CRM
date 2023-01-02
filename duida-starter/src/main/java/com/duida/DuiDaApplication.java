package com.duida;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = {"com.duida"})
@EnableTransactionManagement
public class DuiDaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DuiDaApplication.class);
    }
}
