package com.ron.springboot.service;

import com.ron.springboot.dto.ProductQueryParams;
import com.ron.springboot.dto.ProductRequest;
import com.ron.springboot.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
