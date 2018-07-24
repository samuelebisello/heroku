package com.sam.configurationclient.controller;

import com.sam.configurationclient.Config.Config;
import com.sam.configurationclient.Repo.MongoRepo;
import com.sam.configurationclient.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RefreshScope
public class Controller {

    @Autowired
    private MongoRepo mongoRepo;

    @Autowired
    Config config;


        @RequestMapping("/message")
        String getMessage() {
            return config.getMessage();
        }

    @RequestMapping("/port")
    String getPort() {
        return config.getPort();
    }

        @GetMapping("/users")
        public List<User> getAllUsers() {
            return mongoRepo.findAll();
        }

        @GetMapping("/user/{id}")
    public void insertUser(@PathVariable("id") String id) {
            mongoRepo.insert(new User(id, "Sam"));
        }




}
