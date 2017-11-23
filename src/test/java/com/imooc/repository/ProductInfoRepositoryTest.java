package com.imooc.repository;

import com.imooc.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/11/23.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {
    @Autowired
    ProductInfoRepository repository;
    @Test
    public void save() throws  Exception{
        ProductInfo productInfo=new ProductInfo();
        productInfo.setProductId("123456");
        productInfo.setProductName("宫保鸡翅");
        productInfo.setCategoryType(1);
        productInfo.setProductPrice(new BigDecimal(20));
        productInfo.setProductStatus(0);
        productInfo.setProductStock(100);
        ProductInfo productInfo1 = repository.save(productInfo);
        Assert.assertNotNull(productInfo1);
    }
    @Test
    public void findByProductStatus() throws Exception {
        List<ProductInfo> productInfos = repository.findByProductStatus(0);
        Assert.assertNotNull(productInfos);
    }

}