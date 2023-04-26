package idusw.springboot3.boardthymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //(exclude = DataSourceAutoConfiguration.class)
public class BoardKDSApplication {

    public static void main(String[] args) {
        SpringApplication.run(BoardKDSApplication.class, args);
    }

}
