package com.imooc.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Administrator on 2017/11/23.
 */
@Entity
@Data
public class ProductCategory {

    @Id
    @GeneratedValue
    private Integer categoryId;

    /** 类目名字.修改 */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
