package com.imooc.Utils;

import com.imooc.vo.ProductVO;
import com.imooc.vo.ResultVO;

/**
 * api结果返回的工具类
 * Created by Administrator on 2017/11/23.
 */
public class ResultUtils {
    public static ResultVO success(Object object){
        ResultVO resultVO=new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return  resultVO;
    }
    public static ResultVO error(String msg){
        ResultVO resultVO=new ResultVO();
        resultVO.setCode(1);
        resultVO.setMsg(msg);
        return  resultVO;
    }
}
