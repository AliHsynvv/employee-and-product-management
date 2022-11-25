package com.company.sintra.controller;

import com.company.sintra.entity.User;
import com.company.sintra.repository.UserRepository;
import com.company.sintra.service.impl.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class GreetingsController {
    private final UserService userService;
    @GetMapping("/hello")
    public ResponseEntity<String> greetings() {
        return ResponseEntity.ok("Hello");
    }

    //For authenticated users and managers
    @GetMapping("/user")
    public ResponseEntity<String> user() {
        return ResponseEntity.ok("Welcome to the site");
    }

    //For managers
//    @PostMapping("/user")
//    public void  save(@RequestBody User user) {
//         userService.create(user);
//    }

    //For managers
    @GetMapping("/manager")
    public ResponseEntity<String> manager() {
        return ResponseEntity.ok("Welcome to the site, manager");
    }

}


