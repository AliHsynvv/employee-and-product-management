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
@Table(name = "employees_products", schema = "product_rez", catalog = "postgres")
public class EmployeesProductsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "employees_id")
    private int employeesId;
    @Basic
    @Column(name = "product_id")
    private int productId;
    @Basic
    @Column(name = "date")
    private Date date;

    }
}
