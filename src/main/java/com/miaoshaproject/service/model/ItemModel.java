package com.miaoshaproject.service.model;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * Created by sunpg on 2020/7/4
 */
@Data
public class ItemModel {
    private Integer id;

    /**
     * 商品名称
     */
    @NotBlank(message = "商品不能为空")
    private String title;

    /**
     * 商品价格
     */
    @NotNull(message = "商品价格不能为空")
    @Min(value = 0, message = "商品价格必须大于0")
    private BigDecimal price;

    /**
     * 商品库存
     */
    @NotNull(message = "库存不能不填")
    private Integer stock;

    /**
     * 商品描述
     */
    @NotBlank(message = "商品描述信息不能为空")
    private String description;

    /**
     * 商品销量
     */
    private Integer sales;

    /**
     * 商品图片url
     */
    @NotBlank(message = "图片信息不能为空")
    private String imgUrl;

    /**
     * 使用聚合模型，如果proModel不为空，则说明其有尚未结束的秒杀活动
     */
    private PromoModel promoModel;
}
