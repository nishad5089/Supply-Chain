package com.supplychian.supplychian.controller;

import com.auth.data.entity.User;
import com.auth.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Abdur Rahim Nishad
 * @created 23/02/2021 - 12:09 AM
 * @project supplychian
 */
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class HomeController {
    private final UserService userService;

    @GetMapping("index")
    public String home() {
        return "i am nishad";
    }

    @PostMapping("user/create")
    public ResponseEntity<?> saveUser(@RequestBody User user) {
        User user1 = userService.createUser(user);
        return ResponseEntity.ok(user1);
    }
}
