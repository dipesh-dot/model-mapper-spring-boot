package com.dipesh.modelmapperpractise;

public class UserMappeer {

    public static UserDto convertEntityToDto(User user) {
        UserDto userDto = new UserDto();
       // userDto.setId(user.getId());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setEmail(user.getEmail());
        return userDto;
    }
}
