package uz.digitalone.trailertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TrailerTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrailerTestApplication.class, args);
    }

}
