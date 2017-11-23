package com.imooc.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2017/11/23.
 */
@Data
public class ProductInfoVO {

    @JsonProperty("id")
    private String productId;

    /** 名字. */
    @JsonProperty("name")
    private String productName;

    /** 单价. */
    @JsonProperty("price")
    private BigDecimal productPrice;


    /** 描述. */
    @JsonProperty("description")
    private String productDescription;

    /** 小图. */
    @JsonProperty("icon")
    private String productIcon;


}
