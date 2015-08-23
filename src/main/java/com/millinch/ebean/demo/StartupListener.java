package com.millinch.ebean.demo;

import com.avaje.ebean.config.ServerConfig;
import com.avaje.ebean.event.ServerConfigStartup;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.text.SimpleDateFormat;

/**
 * This guy is lazy,nothing left.
 *
 * @author John Zhang 2015/8/21
 */
public class StartupListener implements ServerConfigStartup {

    @Override
    public void onStart(ServerConfig serverConfig) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        serverConfig.setObjectMapper(objectMapper);
        //serverConfig.setJsonDateTime(JsonConfig.DateTime.ISO8601);
    }
}
