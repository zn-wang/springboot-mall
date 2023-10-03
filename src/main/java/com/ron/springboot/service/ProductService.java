package com.ron.springboot.service;

import com.ron.springboot.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);
}
