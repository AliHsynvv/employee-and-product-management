package com.company.sintra.dto;

import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

/**
 * A DTO for the {@link com.company.sintra.entity.EmployeesProductsEntity} entity
 */
@Data
public class EmployeesProductsEntityDto implements Serializable {
    private final int id;
    private final int employeesId;
    private final int productId;
    private final Date date;
    private final int productCount;
}