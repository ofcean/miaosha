package com.miaoshaproject.validator;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sunpg on 2020/7/4
 */
@Data
public class ValidationResult {
    /**
     * 检验结果是否有错
     */
    private boolean hasErrors = false;

    /**
     * 存放错误信息的map
     */
    private Map<String, String> errorMsgMap = new HashMap<>();

    /**
     * 实现通用的格式化字符串信息获得错误结果的msg方法
     */
    public String getErrMsg() {
        return StringUtils.join(errorMsgMap.values().toArray(), "");
    }
}
