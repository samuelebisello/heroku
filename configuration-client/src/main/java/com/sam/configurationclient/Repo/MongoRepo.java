package com.sam.configurationclient.Repo;

import com.sam.configurationclient.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MongoRepo  extends MongoRepository<User, String> {

    public List<User> findAll();
    public User insert(User user);

}
