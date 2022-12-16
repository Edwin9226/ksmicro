package com.ks.productservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "product")
public class ProductEntity {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
    @Column(name = "productName", nullable = false, length = 100)
 private String productName;
    @Column(name = "productDescription", nullable = false, length = 100)
 private String productDescription;
 private Double perUnitPrice;


}
