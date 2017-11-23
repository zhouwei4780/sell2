package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/11/23.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private  ProductCategoryRepository repository;
    @Test
    public void save() throws Exception {
        ProductCategory productCategory=new ProductCategory("当月爆款",2);
        ProductCategory category = repository.save(productCategory);
        Assert.assertNotNull(category);
    }
    @Test
    public void findOne() throws  Exception{
        ProductCategory category = repository.findOne(1);
        Assert.assertNotNull(category);
    }
    @Test
    public void findByCategoryTypeIn() throws Exception {
        List<Integer> integers= Arrays.asList(1,2);
        List<ProductCategory> byCategoryTypeIn = repository.findByCategoryTypeIn(integers);
        Assert.assertNotNull(byCategoryTypeIn);
    }

}