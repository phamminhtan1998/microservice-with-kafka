package com.phamtan.user.web.api;

import com.phamtan.user.entity.User;
import com.phamtan.user.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<User>> findAll()  {
        List<User> data = userService.findAll();
        return new ResponseEntity<>(data, HttpStatus.OK);

    }
    @GetMapping("/{id}")
    public  ResponseEntity<User> findById(String id) {

            User data = userService.findById(id);
            return new ResponseEntity<>(data,HttpStatus.OK);

    }
    @PostMapping
    public ResponseEntity<Object> create(@RequestBody User user){
            User userRes = userService.createUser(user);
            return new ResponseEntity<>(userRes,HttpStatus.CREATED);
    }
    @GetMapping("/forget-password/{email}")
    public String forgetPassword(@PathVariable("email") String email){
       return  userService.forgetPassword(email);
    }


}
