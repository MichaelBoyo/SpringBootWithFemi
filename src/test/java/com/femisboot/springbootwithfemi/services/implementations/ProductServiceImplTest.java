package com.femisboot.springbootwithfemi.services.implementations;

import com.femisboot.springbootwithfemi.data.dtos.requests.ProductRequest;
import com.femisboot.springbootwithfemi.data.models.entities.Cart;
import com.femisboot.springbootwithfemi.data.models.enums.Category;
import com.femisboot.springbootwithfemi.services.ProductService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductServiceImplTest {
    @Autowired
    private ProductService productService;
    ProductRequest request;

    @BeforeEach
    void setUp()  {
//        Path path = Paths.get("home/download/photo.jpg");
//        MultipartFile file = new MockMultipartFile("photo", Files.readAllBytes(path));
        request = ProductRequest.builder()
                .name("milk")
                .price(BigDecimal.valueOf(100))
                .quantity(10)
                .imageUrl("https://images.unsplash.com/photo-1550583724-b2692b85b150?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8bWlsa3xlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60")
                .description("milk is good for health")
                .categories(Set.of(Category.GROCERIES, Category.DAIRY, Category.BEVERAGES, Category.FOOD))
                .build();
    }


    @AfterEach
    void tearDown() {
        productService.deleteAllProducts();
    }

    @Test
    void createProduct() {
        var res = productService.createProduct(request);
        assertEquals(1L, productService.count());
        assertNotNull(res);
    }

    @Test
    void updateProduct() {
    }

    @Test
    void deleteProduct() {
    }

    @Test
    void deleteAllProducts() {
    }

    @Test
    void getProduct() {
    }

    @Test
    void count() {
    }
}