package com.example.sbtest;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
interface ProductMapper {

    List<ProductDto> toDtos(List<Product> products);

    ProductDto toDto(Product product);
}
