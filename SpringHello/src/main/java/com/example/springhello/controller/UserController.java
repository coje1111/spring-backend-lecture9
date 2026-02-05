package com.example.springhello.controller;

import com.example.springhello.dto.UserDto;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping("/{id}")
    public UserDto getUserById(@PathVariable Long id) {
        return new UserDto(id, "Kim", 27);
    }
}
