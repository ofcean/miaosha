package com.miaoshaproject.error;

/**
 * Created by sunpg on 2020/7/4
 */
public interface CommonError {
    int getErrCode();

    String getErrMsg();

    CommonError setErrMsg(String errorMsg);
}
