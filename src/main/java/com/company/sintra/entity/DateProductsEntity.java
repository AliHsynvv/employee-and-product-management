package com.company.sintra.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "date_products", schema = "product_rez", catalog = "postgres")
public class DateProductsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "products_id")
    private int productsId;
    @Basic
    @Column(name = "count")
    private Integer count;
}
