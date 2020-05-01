package com.example.external.config.externalconfigproperties.utility;

import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.DefaultPropertySourceFactory;
import org.springframework.core.io.support.EncodedResource;

import java.io.IOException;
import java.util.List;


public class PropertySourceFactoryUtility extends DefaultPropertySourceFactory {
    @Override
    public PropertySource<?> createPropertySource(String name, EncodedResource resource) throws IOException {
        if (resource == null)
            return super.createPropertySource(name, resource);
        else {
        List<PropertySource<?>> propertySourceList = new YamlPropertySourceLoader()
                .load(resource.getResource().getFilename(), resource.getResource());
        return !propertySourceList.isEmpty() ? propertySourceList.iterator()
                .next() : super.createPropertySource(name, resource);
    }
    }
}
