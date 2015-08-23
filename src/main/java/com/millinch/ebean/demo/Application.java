package com.millinch.ebean.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.avaje.agentloader.AgentLoader;
import org.avaje.ebeanorm.jackson.JacksonEbeanModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import java.text.SimpleDateFormat;

/**
 * Spring Boot Application Main Class
 *
 * @author John Zhang 2015/8/21
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    static {
        if (!AgentLoader.loadAgentFromClasspath(
                "avaje-ebeanorm-agent",
                "debug=1;packages=com.millinch.ebean.demo.domain")) {
            LOGGER.info("avaje-ebeanorm-agent not found in classpath - not dynamically loaded");
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public ObjectMapper objectMapper(){
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        objectMapper.registerModule(new JacksonEbeanModule());
        return objectMapper;
    }

    @Bean
    public MappingJackson2JsonView mappingJackson2JsonView() {
        MappingJackson2JsonView jsonView = new MappingJackson2JsonView();
        jsonView.setObjectMapper(objectMapper());
        return jsonView;
    }

    @Bean
    public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter(){
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setObjectMapper(objectMapper());
        return converter;
    }
}
