package com.miaoshaproject.dataobject;

import lombok.Data;

/**
 * Created by sunpg on 2020/7/4
 */
@Data
public class UserDO {
    private Integer id;
    private String name;
    private Byte gender;
    private Integer age;
    private String telphone;
    private String registerMode;
    private String thirdPartyId;
}