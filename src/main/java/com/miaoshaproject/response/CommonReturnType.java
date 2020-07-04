package com.miaoshaproject.response;

import lombok.Data;

/**
 * Created by sunpg on 2020/7/4
 */
@Data
public class CommonReturnType {
    /**
     * 表明对应请求的返回处理结果："success"或"fail"
     */
    private String status;

    /**
     * 如果status=success，则data内返回前端需要的json数据
     * 如果status=fail，则data内使用通用的错误码格式
     */
    private Object data;

    /**
     * 定义一个通用的创建方法
     */
    public static CommonReturnType create(Object result) {
        return CommonReturnType.create(result, "success");
    }

    public static CommonReturnType create(Object result, String status) {
        CommonReturnType type = new CommonReturnType();
        type.setData(result);
        type.setStatus(status);
        return type;
    }
}
