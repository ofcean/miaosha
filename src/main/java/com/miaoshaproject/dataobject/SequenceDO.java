package com.miaoshaproject.dataobject;

import lombok.Data;

/**
 * Created by sunpg on 2020/7/4
 */
@Data
public class SequenceDO {
    private String name;
    private Integer currentValue;
    private Integer step;
}