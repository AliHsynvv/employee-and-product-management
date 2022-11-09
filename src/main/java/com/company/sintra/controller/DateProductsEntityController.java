package com.company.sintra.controller;

import com.company.sintra.dto.DateProductsEntityDto;
import com.company.sintra.repository.DateProductsEntityRepository;
import com.company.sintra.service.DateProductsEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Products")
public class DateProductsEntityController {
    private final DateProductsEntityService dateProductsEntityService;

    @PostMapping
    public void create(@RequestBody DateProductsEntityDto dateProductsEntityDto) {
        dateProductsEntityService.create(dateProductsEntityDto);
    }
}
