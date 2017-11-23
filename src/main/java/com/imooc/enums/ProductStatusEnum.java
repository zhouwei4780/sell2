package com.imooc.enums;

import lombok.Data;
import lombok.Getter;

/**
 * Created by Administrator on 2017/11/23.
 */
@Getter
public enum ProductStatusEnum {
    UP(0,"在架"),
    DOWN(1,"下架"),
    ;

    private Integer code;
    private String msg;

    ProductStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
