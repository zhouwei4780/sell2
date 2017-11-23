package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Administrator on 2017/11/23.
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer>{
    //findByCategoryTypeIn
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

}
