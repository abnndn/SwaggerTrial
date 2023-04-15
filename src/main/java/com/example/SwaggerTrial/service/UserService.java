package com.example.SwaggerTrial.service;

import com.example.SwaggerTrial.api.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList;

    @Autowired
    public UserService() {
        userList = new ArrayList<>();
        userList.add(User.builder()
                .id(1)
                .name("name1")
                .build());
        userList.add(User.builder()
                .id(2 )
                .name("name2")
                .build());
    }

    public Optional<User> getUser(Integer id) {
        for (User user: userList) {
            if (user.getId() == id) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }
}
