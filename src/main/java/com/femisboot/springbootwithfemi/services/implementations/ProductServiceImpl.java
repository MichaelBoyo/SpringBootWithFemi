package com.femisboot.springbootwithfemi.services.implementations;

import com.femisboot.springbootwithfemi.data.dtos.requests.ProductRequest;
import com.femisboot.springbootwithfemi.data.dtos.responses.Response;
import com.femisboot.springbootwithfemi.data.models.entities.Product;
import com.femisboot.springbootwithfemi.data.repositories.ProductRepository;
import com.femisboot.springbootwithfemi.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public Response createProduct(ProductRequest request) {
        return null;
    }

    @Override
    public Response updateProduct(ProductRequest request) {
        return null;
    }

    @Override
    public Response deleteProduct(Long id) {
         productRepository.deleteById(id);
        return new Response(HttpStatus.OK,"Product deleted successfully");
    }

    @Override
    public Response deleteAllProducts() {
        productRepository.deleteAll();
        return new Response(HttpStatus.OK,"All products deleted successfully");
    }

    @Override
    public Product getProduct(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("not found"));
    }

    @Override
    public Long count() {
        return productRepository.count();
    }
}
