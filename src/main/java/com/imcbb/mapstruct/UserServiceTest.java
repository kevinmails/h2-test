package com.imcbb.mapstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author kevin.chen
 * Date 2023/3/28
 * Time 22:57
 */
@Component
public class UserServiceTest {

    @Autowired
    UserMapper mapper;


    public void test(){
        UserDTO userDTO = new UserDTO("xiaoming",20);

        UserDO userDO =  mapper.useDTOToUser(userDTO);

        System.out.println(userDO);


    }

}
