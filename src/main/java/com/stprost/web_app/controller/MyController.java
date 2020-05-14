package com.stprost.web_app.controller;

import com.stprost.web_app.entity.ActivityType;
import com.stprost.web_app.entity.User;
import com.stprost.web_app.repository.ActivityTypeRepository;
import com.stprost.web_app.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class MyController {
    private UserRepository userRepository;
    private ActivityTypeRepository activityTypeRepository;

    @GetMapping("type-test")
    public List<ActivityType> showType() {
        return activityTypeRepository.findAll();
    }

    @GetMapping("/user-test")
    public List<User> showUser() {
        return  userRepository.findAll();
    }
}
