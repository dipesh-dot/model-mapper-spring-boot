package com.dipesh.modelmapperpractise;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://192.168.0.107:5500")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/save")
    public ResponseEntity<User> save(@RequestBody User user){
       return ResponseEntity.ok().body(userService.createUser(user));
    }
    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getById(@PathVariable Long id ){
        return ResponseEntity.ok().body(userService.getUserById(id));
    }
}
