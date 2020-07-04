package com.miaoshaproject.dao;

import com.miaoshaproject.dataobject.UserPasswordDO;

/**
 * Created by sunpg on 2020/7/4
 */
public interface UserPasswordDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserPasswordDO record);

    int insertSelective(UserPasswordDO record);

    UserPasswordDO selectByUserId(Integer userId);

    UserPasswordDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserPasswordDO record);

    int updateByPrimaryKey(UserPasswordDO record);
}