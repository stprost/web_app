package com.stprost.web_app.controller;

import com.stprost.web_app.entity.ActivityType;
import com.stprost.web_app.entity.User;
import com.stprost.web_app.repository.ActivityTypeRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class ActivityTypeController {
    private ActivityTypeRepository activityTypeRepository;

    @GetMapping("/type")
    public List<ActivityType> getActivityTypes() {
        return activityTypeRepository.findAll();
    }
}
