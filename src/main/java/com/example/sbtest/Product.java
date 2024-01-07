package com.example.sbtest;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "products", schema="my_schema")
class Product {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "products_seq")
    @SequenceGenerator(name = "products_seq", sequenceName = "products_seq", allocationSize = 1)
    private Integer id;

    @Column(name = "name")
    private String name;
}
