package com.example.demo2.controller;


import com.example.demo2.dto.UserDTO;
import com.example.demo2.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    @Autowired
    private final UserService userService;

    @PostMapping("/create")
    public UserDTO CreateUser(@RequestBody UserDTO userDTO) {
        return userService.createUser(userDTO);
    }
    @GetMapping("/{id}")
    public UserDTO GetUsersById(@PathVariable("id") Integer id) {
        return userService.getUsersById(id );
}

    @PatchMapping("/update/{id}")
    public UserDTO UpdateUser(@PathVariable("id") Integer id,@RequestBody UserDTO userDTO) {
        return userService.updateUser(id , userDTO);
}
@DeleteMapping("/delete/{id}")
    public UserDTO DeleteUser(@PathVariable("id") Integer id ,@RequestBody UserDTO userDTO) {
        return userService.DeleteUserById(id , userDTO);
}

}

