package com.miaoshaproject.service.model;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 用户下单的交易模型
 * Created by sunpg on 2020/7/4
 */
@Data
public class OrderModel {
    /**
     * 订单号
     */
    private String id;

    /**
     * 购买的用户ID
     */
    private Integer userId;

    /**
     * 购买的商品ID
     */
    private Integer itemId;

    /**
     * 购买商品的单价
     */
    private BigDecimal itemPrice;

    /**
     * 购买的数量
     */
    private Integer amount;

    /**
     * 购买金额
     */
    private BigDecimal orderPrice;

    private Integer promoId;
}
