package com.miaoshaproject.service;

import com.miaoshaproject.service.model.PromoModel;


/**
 * Created by sunpg on 2020/7/4
 */
public interface PromoService {
    PromoModel getPromoByItemId(Integer itemId);
}
