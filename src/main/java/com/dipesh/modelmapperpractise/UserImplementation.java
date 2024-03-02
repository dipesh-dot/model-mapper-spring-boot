package com.dipesh.modelmapperpractise;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserImplementation implements UserService{

private final UserRepository userRepository;

    private ModelMapper modelMapper;

    public UserImplementation(UserRepository userRepository,ModelMapper modelMapper ) {
        this.userRepository = userRepository;
        this.modelMapper =modelMapper;
    }

    @Override
    public User createUser(User user) {
        return  userRepository.save(user);
    }

    @Override
    public List<UserDto> getallUsers() {
        List<User> userList = userRepository.findAll();
        List<UserDto> userDtoList = new ArrayList<>();
        for(User user:userList) {
            // ModelMapper
            UserDto userDto = modelMapper.map(user, UserDto.class);
            userDtoList.add(userDto);
        }
        return userDtoList;
    }

    @Override
    public UserDto getUserById(Long id) {
        Optional<User> optionalUser = userRepository.findById(id);
        // ModelMapper
        return modelMapper.map(optionalUser.get(), UserDto.class);
    }
}
