package com.company.sintra.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;
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
    @Basic
    @Column(name = "date")
    private Date date;

}
