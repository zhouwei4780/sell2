package com.imooc.service;

import com.imooc.dataobject.ProductCategory;
import org.jvnet.hk2.annotations.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/11/23.
 */
public interface CategoryService {
    /***查询类目**/
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryType);
    /***查询所有**/
    public List<ProductCategory> findAll();
    /**增加一种类目**/
    public ProductCategory save(ProductCategory productCategory);
}
