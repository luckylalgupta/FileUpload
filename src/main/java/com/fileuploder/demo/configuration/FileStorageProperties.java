package com.fileuploder.demo.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter@Setter
@ConfigurationProperties(prefix="file")
@Component
public class FileStorageProperties {
    private String uploadDir;
}
