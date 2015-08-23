package com.millinch.ebean.demo;

import org.avaje.agentloader.AgentLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * Spring Boot Application Main Class
 *
 * @author John Zhang 2015/8/21
 */
@EnableAutoConfiguration
public class Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        if (!AgentLoader.loadAgentFromClasspath(
                "avaje-ebeanorm-agent",
                "debug=1;packages=com.millinch.ebean.demo.domain")) {
            LOGGER.info("avaje-ebeanorm-agent not found in classpath - not dynamically loaded");
        }
        SpringApplication.run(Application.class, args);
    }
}
