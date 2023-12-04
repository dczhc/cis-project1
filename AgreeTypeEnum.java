package org.gzzt.manage.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.baomidou.mybatisplus.annotation.IEnum;
import lombok.Getter;

/**
 * 协议类型枚举
 * @author terry
 */
public enum AgreeTypeEnum implements IEnum<Integer> {


    /**
     *退费规则
     */
    REFUND(1, "退费规则"),


    /**
     *家长小程序用户服务协议
     */
    WECHAT_PARENT_USER(2, "家长小程序用户服务协议"),


    /**
     *家长小程序隐私政策
     */
    WECHAT_PARENT_PRIVACY_POLICY(3, "家长小程序隐私政策 "),


    /**
     *教师小程序用户服务协议
     */
    WECHAT_TEACHER_USER(4, "教师小程序用户服务协议"),

    /**
     * 教师小程序隐私政策
     */
    WECHAT_TEACHER_PRIVACY_POLICY (5, "教师小程序隐私政策");

    @EnumValue
    private Integer value;

    @Getter
    private String desc;

    AgreeTypeEnum(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    @Override
    public Integer getValue() {
        return value;
    }
}

