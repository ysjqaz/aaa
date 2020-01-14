package cn.lijun.springcloud.service.impl;

import cn.lijun.springcloud.entities.Product;
import cn.lijun.springcloud.mapper.ProductMapper;
import cn.lijun.springcloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lijun
 * @date 2020/1/14 14:12
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;
    @Override
    public boolean add(Product product) {
        return productMapper.addProduct(product);
    }

    @Override
    public Product get(Long id) {
        return productMapper.findById(id);

    }

    @Override
    public List<Product> list() {
        return productMapper.findAll();
    }
}
