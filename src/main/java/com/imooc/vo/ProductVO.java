package com.imooc.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * Created by Administrator on 2017/11/23.
 */
@Data
public class ProductVO {
    /** 类目名字. */
    @JsonProperty("name")
    private String categoryName;

    /** 类目编号. */
    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOS;

}
