package com.company.sintra.dto;

import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

/**
 * A DTO for the {@link com.company.sintra.entity.DateProductsEntity} entity
 */
@Data
public class DateProductsEntityDto implements Serializable {
    private final int id;
    private final int productsId;
    private final Integer count;
    private final Date date;
}