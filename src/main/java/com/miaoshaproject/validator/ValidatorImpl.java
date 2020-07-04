package com.miaoshaproject.validator;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

/**
 * Created by sunpg on 2020/7/4
 */
@Component
public class ValidatorImpl implements InitializingBean {
    private Validator validator;

    /**
     * 实现检验方法并返回检验结果
     */
    public ValidationResult validate(Object bean) {
        final ValidationResult result = new ValidationResult();
        Set<ConstraintViolation<Object>> constraintValidatorSet = validator.validate(bean);
        if (constraintValidatorSet.size() > 0) {
            //有错误
            result.setHasErrors(true);
            constraintValidatorSet.forEach(constraintValidation->{
                String errMsg = constraintValidation.getMessage();
                String propertyName = constraintValidation.getPropertyPath().toString();
                result.getErrorMsgMap().put(propertyName, errMsg);
            });
        }
        return result;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //将hibernate validator通过工厂的初始化方式使其实例化
        this.validator = Validation.buildDefaultValidatorFactory().getValidator();
    }
}
