package com.company.sintra.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "product", schema = "product_rez", catalog = "postgres")
public class ProductEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "count")
    private int count;
    @Basic
    @Column(name = "date")
    private Date date;

}
