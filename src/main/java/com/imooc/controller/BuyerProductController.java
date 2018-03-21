package com.imooc.controller;

import com.imooc.Utils.ResultUtils;
import com.imooc.dataobject.ProductCategory;
import com.imooc.dataobject.ProductInfo;
import com.imooc.service.CategoryService;
import com.imooc.service.ProductService;
import com.imooc.vo.ProductInfoVO;
import com.imooc.vo.ProductVO;
import com.imooc.vo.ResultVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2017/11/23.
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;
    @GetMapping("list")
    public ResultVO list(){
        //1.查询所有上架的商品  修改
        List<ProductInfo> productInfos = productService.findUpAll();
        //2. 查询类目(一次性查询)
        //2.1先拿到所有的上架商品的类目编号集合
        List<Integer> categoryTypeList=productInfos.stream().map(e ->e.getCategoryType()).collect(Collectors.toList());
        //2.2通过类目编号查询出对应的类目
        List<ProductCategory> productCategoryList=categoryService.findByCategoryTypeIn(categoryTypeList);
        //3. 数据拼装
        //3.1就是拼接好ResultVo
        //3.2拼接好List<ProductVO>放到ResultVo
        List<ProductVO> productVOS=new ArrayList<>();
        for(ProductCategory productCategory:productCategoryList){
            ProductVO productVO=new ProductVO();
            productVO.setCategoryType(productCategory.getCategoryType());
            productVO.setCategoryName(productCategory.getCategoryName());
            //3.3拼接好List<ProductInfoVO>放到ProductVO
            List<ProductInfoVO> productInfoVOS=new ArrayList<>();
            //拿到对应类目的上架产品
            for(ProductInfo productInfo:productInfos){
                if(productInfo.getCategoryType().equals(productVO
                .getCategoryType())){
                    ProductInfoVO productInfoVO=new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo,productInfoVO);
                    //3.3 end
                    productInfoVOS.add(productInfoVO);
                }
            }
            productVO.setProductInfoVOS(productInfoVOS);
            //3.2 end
            productVOS.add(productVO);
        }
        //3.3 end
        return ResultUtils.success(productVOS);
    }
}
