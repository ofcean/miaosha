package com.miaoshaproject.dao;

import com.miaoshaproject.dataobject.OrderDO;

/**
 * Created by sunpg on 2020/7/4
 */
public interface OrderDOMapper {
    int deleteByPrimaryKey(String id);

    int insert(OrderDO record);

    int insertSelective(OrderDO record);

    OrderDO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OrderDO record);

    int updateByPrimaryKey(OrderDO record);
}