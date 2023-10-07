package com.ron.springboot.service;

import com.ron.springboot.dto.ProductRequest;
import com.ron.springboot.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
