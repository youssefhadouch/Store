package com.example.demo2.service;

import com.example.demo2.dto.UserDTO;
import com.example.demo2.entity.UserEntity;
import com.example.demo2.mapper.MyMapper;
import com.example.demo2.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{


    private final UserRepository userRepository;
    private final MyMapper userMapper;

    @Override
    public UserDTO createUser(UserDTO userdto) {

//        UserEntity userEntity = new UserEntity();
//        userEntity.setAge(userdto.getAge());
//        userEntity.setEmail(userdto.getEmail());
//        userEntity.setName(userdto.getFirstname());

//        UserEntity u2 = UserEntity.builder()
//                .age(userdto.getAge())
//                .email(userdto.getEmail())
//                .name(userdto.getFirstname())
//                .build();

        if(userdto.getAge() <= 10 ){
            throw new RuntimeException("INVALID AGE");
            }


        UserEntity user = userMapper.fromDtoToUser(userdto);

        userRepository.save(user);

        return userdto;
    }


    @Override
    public UserDTO getUsersById(Integer id ) {

       UserEntity userEntity = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("user not found "));



        return userMapper.fromUserToDto(userEntity);
    }





    @Override
    public UserDTO updateUser(Integer id, UserDTO userdto) {

       UserEntity  userEntity = userRepository.findById(id)
               .orElseThrow(() -> new RuntimeException("user not found"));

        UserEntity user = userMapper.updateUserEntity(userdto , userEntity);

        userRepository.save(user);

        return userdto;
    }


    @Override
    public UserDTO DeleteUserById(Integer id, UserDTO userdto) {
      UserEntity userEntity = userRepository.findById(id)
              .orElseThrow(()-> new RuntimeException("user not found"));
      userRepository.delete(userEntity);
        return userdto;
    }


}
