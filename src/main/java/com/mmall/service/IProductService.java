package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.Product;

/**
 * @Author: fanhao
 * @Date: 2018/9/16 20:29
 * @Version 1.0
 */
public interface IProductService {
    public ServerResponse saveOrUpdateProduct(Product product);

    public ServerResponse<String> setSalesStatus(Integer productId, Integer status);
}
