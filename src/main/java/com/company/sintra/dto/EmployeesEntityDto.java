package com.company.sintra.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.company.sintra.entity.EmployeesEntity} entity
 */
@Data
public class EmployeesEntityDto implements Serializable {
    private final int id;
    private final String name;
}