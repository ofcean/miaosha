package com.miaoshaproject.dataobject;

import lombok.Data;

/**
 * Created by sunpg on 2020/7/4
 */
@Data
public class UserPasswordDO {
    private Integer id;
    private String encrptPassword;
    private Integer userId;
}