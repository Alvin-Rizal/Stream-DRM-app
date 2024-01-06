package com.enigma.streamdrmapp.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@Entity
@Table(name = "mst_product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "product_name",nullable = false)
    private String productName;

    @Column(name = "product_description",nullable = false)
    private String description;

    @OneToMany(mappedBy = "product")
    private List<ProductPrice> productPrices;
}
