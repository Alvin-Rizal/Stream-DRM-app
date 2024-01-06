package com.enigma.streamdrmapp.entity;

import jakarta.persistence.*;
import lombok.*;

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

    @Column(name="price",nullable = false)
    private Integer price;
}
