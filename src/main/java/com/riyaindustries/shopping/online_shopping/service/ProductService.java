package com.riyaindustries.shopping.online_shopping.service;

import com.riyaindustries.shopping.online_shopping.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> getAllProducts();
    List<Product> searchProductsByName(String name);
    Optional<Product> getProductById(Long id);
    Product createProduct(Product product);
    Product updateProduct(Long id, Product product);
    void deleteProduct(Long id);
}


