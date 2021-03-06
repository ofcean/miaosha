package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.OrderModel;


/**
 * Created by sunpg on 2020/7/4
 */
public interface OrderService {
    //通过前端url上传过来的秒杀活动id，然后下单接口内校验对应id是否属于对应商品且活动已经开始
    OrderModel createOrder(Integer userId, Integer itemId, Integer amount, Integer promoId) throws BusinessException;
}
