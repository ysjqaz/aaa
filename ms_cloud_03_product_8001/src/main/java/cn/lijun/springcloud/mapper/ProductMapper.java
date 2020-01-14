package cn.lijun.springcloud.mapper;

import cn.lijun.springcloud.entities.Product;

import java.util.List;

/**
 * @author lijun
 * @date 2020/1/14 14:01
 */

public interface ProductMapper {
    Product findById(Long pid);
    List<Product> findAll();
    boolean addProduct(Product product);

}
