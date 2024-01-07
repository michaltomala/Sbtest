package com.example.sbtest;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@AllArgsConstructor
@Service
class ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper mapper;

    public List<ProductDto> findAll() {
        return mapper.toDtos(productRepository.findAll());
    }

    @Transactional
    public ProductDto save(String name) {
        Product product = new Product();
        product.setName(name);
        return mapper.toDto(productRepository.save(product));
    }

}
