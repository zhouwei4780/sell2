package com.imooc.service;

import com.imooc.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by Administrator on 2017/11/23.
 */
public interface ProductService {
    ProductInfo findOne(String productId);

    /**
     * 查询所有在架商品列表
     * @return
     */
    List<ProductInfo> findUpAll();



    ProductInfo save(ProductInfo productInfo);

//    //加库存
//    void increaseStock(List<CartDTO> cartDTOList);
//
//    //减库存
//    void decreaseStock(List<CartDTO> cartDTOList);
}
