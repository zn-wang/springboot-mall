package com.ron.springboot.dao;

import com.ron.springboot.dto.ProductRequest;
import com.ron.springboot.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    Void updateProduct(Integer productId, ProductRequest productRequest);

    Void deleteProduct(Integer productId);
}
