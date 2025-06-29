package com.app.ecom.service;

import com.app.ecom.dtos.ProductRequest;
import com.app.ecom.dtos.ProductResponse;
import com.app.ecom.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    ProductResponse createProduct(ProductRequest productRequest);

    Optional<ProductResponse> updateProduct(Long id, ProductRequest productRequest);

    List<ProductResponse> getAllProducts();

    boolean deleteProduct(Long id);

    List<ProductResponse> searchProducts(String keyword);
}
