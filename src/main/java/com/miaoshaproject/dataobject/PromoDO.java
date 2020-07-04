package com.miaoshaproject.dataobject;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by sunpg on 2020/7/4
 */
@Data
public class PromoDO {
    private Integer id;
    private String promoName;
    private Date startDate;
    private Date endDate;
    private Integer itemId;
    private BigDecimal promoItemPrice;
}