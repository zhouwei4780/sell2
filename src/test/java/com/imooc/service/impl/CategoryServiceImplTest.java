package com.imooc.service.impl;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2017/11/23.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl serviceImpl;

    @Test
    public void findByCategoryTypeIn() throws Exception {
        List<ProductCategory> categories = serviceImpl.findByCategoryTypeIn(Arrays.asList(1, 2));
        Assert.assertNotNull(categories);
    }

    @Test
    public void findAll() throws Exception {
        List<ProductCategory> productCategoryList = serviceImpl.findByCategoryTypeIn(Arrays.asList(1,2));
        Assert.assertNotEquals(0, productCategoryList.size());
    }

    @Test
    public void save() throws Exception {
        ProductCategory productCategory=new ProductCategory("女生最爱",4);
        ProductCategory productCategory1 = serviceImpl.save(productCategory);
        Assert.assertNotNull(productCategory1);
    }

}