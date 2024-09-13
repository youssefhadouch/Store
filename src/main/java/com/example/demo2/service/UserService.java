package com.example.demo2.service;

import com.example.demo2.dto.UserDTO;
import org.springframework.stereotype.Service;


@Service


public interface UserService  {

    UserDTO createUser(UserDTO user);



    UserDTO getUsersById(Integer id);



    UserDTO updateUser(Integer id, UserDTO userDTO);



    UserDTO DeleteUserById(Integer id, UserDTO userDTO);




}
