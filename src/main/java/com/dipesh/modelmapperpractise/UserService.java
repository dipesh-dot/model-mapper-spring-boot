package com.dipesh.modelmapperpractise;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    User createUser(User user);
    List<UserDto>getallUsers();

    UserDto getUserById(Long id);

}
