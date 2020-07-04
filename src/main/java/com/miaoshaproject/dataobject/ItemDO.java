package com.miaoshaproject.dataobject;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by sunpg on 2020/7/4
 */
@Data
public class ItemDO {
    private Integer id;
    private String title;
    private BigDecimal price;
    private String description;
    private Integer sales;
    private String imgUrl;
}