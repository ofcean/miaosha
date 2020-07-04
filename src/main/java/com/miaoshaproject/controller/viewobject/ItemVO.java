package com.miaoshaproject.controller.viewobject;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by sunpg on 2020/7/4
 */
@Data
public class ItemVO {
    private Integer id;

    /**
     * 商品名称
     */
    private String title;

    /**
     * 商品价格
     */
    private BigDecimal price;

    /**
     * 商品库存
     */
    private Integer stock;

    /**
     * 商品描述
     */
    private String description;

    /**
     * 商品销量
     */
    private Integer sales;

    /**
     * 商品图片url
     */
    private String imgUrl;

    /**
     * 商品是否在秒杀活动中以及对应的状态
     */
    private Integer promoStatus;

    private BigDecimal promoPrice;

    private Integer promoId;

    private String startDate;
}
