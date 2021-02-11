package com.fileuploder.demo;

import com.fileuploder.demo.configuration.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
        FileStorageProperties.class
})
public class FileuploaderApplication {

    public static void main(String[] args) {
        SpringApplication.run(FileuploaderApplication.class, args);
    }

}
