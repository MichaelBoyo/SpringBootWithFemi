package com.femisboot.springbootwithfemi.cloud;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CloudinaryServiceImplTest {
    @Autowired
    private CloudService cloudService;

    private MultipartFile file;

    @BeforeEach
    void setUp() throws IOException {
        Path path = Paths.get("/home/tbthecoder/Downloads/photo.jpg");
        file = new MockMultipartFile("photo", Files.readAllBytes(path));
    }

    @Test
    void uploadTest() throws IOException {
      String url =   cloudService.upload(file.getBytes(), Map.of("resource_type", "auto"));
      assertNotNull(url);
    }
}