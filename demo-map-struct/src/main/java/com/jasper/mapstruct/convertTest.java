package com.jasper.mapstruct;

import com.jasper.mapstruct.bo.UserBO;
import com.jasper.mapstruct.convert.UserConvert;
import com.jasper.mapstruct.dataobject.UserDO;

/**
 * @author jasper
 * @date 2022-04-07 14:50
 */
public class convertTest {
    public static void main(String[] args) {
        // 创建 UserDO 对象
        UserDO userDO = new UserDO();
        userDO.setId(1);
        userDO.setUsername("Jasper");
        userDO.setPassword("123456");
        // 进行转换
        UserBO userBO = UserConvert.INSTANCE.convert(userDO);
        System.out.println(userBO.getId());
        System.out.println(userBO.getUsername());
        System.out.println(userBO.getPassword());
    }
}
