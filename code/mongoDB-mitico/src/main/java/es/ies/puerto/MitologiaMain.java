package es.ies.puerto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class MitologiaMain {

    public static void main(String[] args) {
        SpringApplication.run(MitologiaMain.class, args);
    }

}