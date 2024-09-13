package com.example.demo2.mapper;

import com.example.demo2.dto.UserDTO;
import com.example.demo2.entity.UserEntity;
import org.springframework.beans.BeanUtils;




public class UserMapper {

    public  UserDTO fromUserToDto(UserEntity userEntity) {
        UserDTO userDTO = new UserDTO();
        userDTO.setAge(userEntity.getAge());
        userDTO.setEmail(userEntity.getEmail());
        userDTO.setFirstname(userEntity.getName());
        return userDTO;
    }

    public UserEntity fromDtoToUser(UserDTO userDto) {
       UserEntity userEntity = new UserEntity();
       userEntity.setAge(userDto.getAge());
       userEntity.setEmail(userDto.getEmail());
       userEntity.setName(userDto.getFirstname());
        return userEntity;
    }

    public void updateUserEntity(UserDTO userDTO, UserEntity userEntity) {
        userEntity.setAge(userDTO.getAge());
        userEntity.setEmail(userDTO.getEmail());
        userEntity.setName(userDTO.getFirstname());

    }

}
