package com.millinch.ebean.demo;

import org.avaje.agentloader.AgentLoader;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This guy is lazy,nothing left.
 *
 * @author John Zhang 2015/8/20
 */
public abstract class Enhancer {

    private static final Logger LOGGER = LoggerFactory.getLogger(Enhancer.class);

    @Before
    public void setup(){
        if (!AgentLoader.loadAgentFromClasspath(
                "avaje-ebeanorm-agent",
                "debug=1;packages=com.millinch.ebean.demo.domain"
        )) {

            LOGGER.info("avaje-ebeanorm-agent not found in classpath - not dynamically loaded");
        }
    }
}
