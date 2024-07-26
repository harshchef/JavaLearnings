package com.example.storage_service_dbms.service;

import com.example.storage_service_dbms.entity.ImageData;
import com.example.storage_service_dbms.repository.StorageRepo;
import com.example.storage_service_dbms.util.ImageUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

class StorageServiceTest {

    @Mock
    private StorageRepo repo;

    @InjectMocks
    private StorageService storageService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void uploadImage() throws IOException {
        // Arrange
        MultipartFile file = new MockMultipartFile("image", "test.jpg", "image/jpeg", "test image content".getBytes());
        ImageData imageData = ImageData.builder()
                .name(file.getOriginalFilename())
                .type(file.getContentType())
                .imageData(ImageUtils.compressImage(file.getBytes()))
                .build();

        // Mock the repository save method
        when(repo.save(any(ImageData.class))).thenReturn(imageData);

        // Act
        String result = storageService.uploadImage(file);

        // Assert
        assertEquals("Image uploaded successfully: test.jpg", result);
    }

    @Test
    void downloadImage() throws IOException {
        // Arrange
        String filename = "test.jpg";
        byte[] compressedImageData = ImageUtils.compressImage("test image content".getBytes());
        ImageData imageData = ImageData.builder()
                .name(filename)
                .type("image/jpeg")
                .imageData(compressedImageData)
                .build();

        // Mock the repository findByName method
        when(repo.findByName(filename)).thenReturn(Optional.of(imageData));

        // Act
        byte[] result = storageService.downloadImage(filename);

        // Assert
        assertArrayEquals(ImageUtils.decompressImage(compressedImageData), result);
    }
}
