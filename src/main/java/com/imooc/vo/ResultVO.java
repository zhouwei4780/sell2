package com.imooc.vo;

import lombok.Data;

/**
 * Created by Administrator on 2017/11/23.
 */
@Data
public class ResultVO<T> {
    private Integer code;
    private String msg;
    private T data;
}
