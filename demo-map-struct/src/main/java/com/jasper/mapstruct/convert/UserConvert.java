package com.jasper.mapstruct.convert;

import com.jasper.mapstruct.bo.UserBO;
import com.jasper.mapstruct.dataobject.UserDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @author jasper
 * @date 2022-04-07 14:29
 */
@Mapper
public interface UserConvert {

    UserConvert INSTANCE = Mappers.getMapper(UserConvert.class);

    @Mapping(source = "id", target = "id")
    UserBO convert(UserDO userDO);

}