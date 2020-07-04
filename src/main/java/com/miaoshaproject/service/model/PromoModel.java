package com.miaoshaproject.service.model;

import lombok.Data;
import org.joda.time.DateTime;

import java.math.BigDecimal;

/**
 * Created by sunpg on 2020/7/4
 */
@Data
public class PromoModel {
    private Integer id;

    private String promoName;

    private DateTime startDate;

    private DateTime endDate;

    private Integer itemId;

    private BigDecimal promoItemPrice;

    /**
     * 秒杀活动状态：1未开始，2进行中，3已结束
     */
    private Integer status;
}
