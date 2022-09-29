package com.femisboot.springbootwithfemi.services;

import com.femisboot.springbootwithfemi.data.dtos.requests.ProductRequest;
import com.femisboot.springbootwithfemi.data.dtos.responses.Response;
import com.femisboot.springbootwithfemi.data.models.entities.Product;

public interface ProductService {
    Response createProduct(ProductRequest request);
    Response updateProduct(ProductRequest request);
    Response deleteProduct(Long id);
    Response deleteAllProducts();
    Product getProduct(Long id);
    Long count();
}
