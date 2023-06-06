package com.imcbb.mapstruct;

import org.mapstruct.Mapper;

/**
 * @author kevin.chen
 * Date 2023/3/28
 * Time 22:55
 */
@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDO useDTOToUser(UserDTO userDTO);
}
