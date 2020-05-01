package com.example.external.config.externalconfigproperties.configuration;


import com.example.external.config.externalconfigproperties.utility.PropertySourceFactoryUtility;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Slf4j
@Getter
@Setter
@Configuration
@PropertySource(value = "${secrets.filePath}", factory = PropertySourceFactoryUtility.class)
public class PropertyAccessorConfig {
    @Value("${datasource.name}")
    private String username;


}
