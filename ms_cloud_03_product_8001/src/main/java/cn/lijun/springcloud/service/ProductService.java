package cn.lijun.springcloud.service;

import cn.lijun.springcloud.entities.Product;

import java.util.List;

/**
 * @author lijun
 * @date 2020/1/14 14:10
 */
public interface ProductService {
    boolean add(Product product);
    Product get(Long id);
    List<Product> list();
}
