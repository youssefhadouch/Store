package com.example.demo2.mapper;

import com.example.demo2.dto.UserDTO;
import com.example.demo2.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface MyMapper {

    @Mapping(target = "firstname", source = "name")
    UserDTO fromUserToDto(UserEntity userEntity);

    @Mapping(target = "name", source = "firstname")
    UserEntity fromDtoToUser(UserDTO userDto);

    @Mapping(target = "name", source = "firstname")
    UserEntity updateUserEntity( UserDTO userDTO, @MappingTarget UserEntity userEntity);

}

