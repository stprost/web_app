package com.stprost.web_app;

import com.stprost.web_app.entity.ActivityType;
import com.stprost.web_app.entity.User;
import com.stprost.web_app.repository.ActivityTypeRepository;
import com.stprost.web_app.repository.UserRepository;
import com.stprost.web_app.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;

import java.util.stream.Stream;

@SpringBootApplication
public class WebAppApplication {
    @Autowired
    private ActivityService activityService;

    public static void main(String[] args) {
        SpringApplication.run(WebAppApplication.class, args);
    }

//    @EventListener(ApplicationReadyEvent.class)
//    public void testJpa() {
//        activityService.findAll().forEach(System.out::println);
//        activityService.findById(0L);
//    }

//    @Bean
//    CommandLineRunner init(UserRepository userRepository, ActivityTypeRepository activityTypeRepository) {
//        Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
//            User user = new User(name, name.toLowerCase() + "@domain.com");
//            userRepository.save(user);
//        });
//        return args -> {
//            userRepository.findAll().forEach(System.out::println);
//        };
//    }
}
