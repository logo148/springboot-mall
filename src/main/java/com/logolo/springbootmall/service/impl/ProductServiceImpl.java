package com.logolo.springbootmall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.logolo.springbootmall.dao.ProductDao;
import com.logolo.springbootmall.model.Product;
import com.logolo.springbootmall.service.ProductService;

@Component
public class ProductServiceImpl implements ProductService {

  @Autowired
  private ProductDao productDao;

  @Override
  public Product getProductById(Integer productId) {

    return productDao.getProductById(productId);

  }

}
