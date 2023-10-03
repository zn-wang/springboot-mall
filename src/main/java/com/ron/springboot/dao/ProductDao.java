package com.ron.springboot.dao;

import com.ron.springboot.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
