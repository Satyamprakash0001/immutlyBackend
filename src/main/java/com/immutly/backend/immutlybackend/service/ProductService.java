package com.immutly.backend.immutlybackend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.immutly.backend.immutlybackend.model.Product;
import com.immutly.backend.immutlybackend.repository.ProductRepository;

@Service
public class ProductService {
    
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long productId) {
        return productRepository.findById(productId);
    }

    public Product addProduct(Product product) {
        // You can add additional validation logic here if needed
        return productRepository.save(product);
    }

    public Product updateProduct(Long productId, Product updatedProduct) {
        Optional<Product> existingProduct = productRepository.findById(productId);

        if (existingProduct.isPresent()) {
            Product currentProduct = existingProduct.get();
            // Update only the fields that are allowed to be updated
            currentProduct.setProductName(updatedProduct.getProductName());
            currentProduct.setProductDescription(updatedProduct.getProductDescription());
            currentProduct.setPrice(updatedProduct.getPrice());
            currentProduct.setAvailabilityStatus(updatedProduct.getAvailabilityStatus());

            return productRepository.save(currentProduct);
        } else {
            // Handle the case where the product with the given ID is not found
            throw new RuntimeException("Product not found with ID: " + productId);
        }
    }

    public void deleteProduct(Long productId) {
        productRepository.deleteById(productId);
    }
    
    public Product updateProductPrice(Long productId, double newPrice) {
        Optional<Product> existingProduct = productRepository.findById(productId);

        if (existingProduct.isPresent()) {
            Product currentProduct = existingProduct.get();
            currentProduct.setPrice(newPrice);

            return productRepository.save(currentProduct);
        } else {
            throw new RuntimeException("Product not found with ID: " + productId);
        }
    }
}
