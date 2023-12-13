package com.logolo.springbootmall.dao;

import com.logolo.springbootmall.model.Product;

public interface ProductDao {

  Product getProductById(Integer productId);

}
