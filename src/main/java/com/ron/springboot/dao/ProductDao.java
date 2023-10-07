package com.ron.springboot.dao;

import com.ron.springboot.dto.ProductRequest;
import com.ron.springboot.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts();

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    Void updateProduct(Integer productId, ProductRequest productRequest);

    Void deleteProduct(Integer productId);
}
