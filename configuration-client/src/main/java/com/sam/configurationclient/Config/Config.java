package com.sam.configurationclient.Config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Config {


    @Value("${message:Hello default}")
    private String message;

    @Value("${spring.data.mongodb.port: 27017}")
    private String port;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
