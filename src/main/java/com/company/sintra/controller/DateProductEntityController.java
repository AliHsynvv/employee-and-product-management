package com.company.sintra.controller;

import com.company.sintra.dto.DateProductsEntityDto;
import com.company.sintra.service.DateProductsEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class DateProductEntityController {
    private final DateProductsEntityService dateProductsEntityService;

    @PostMapping
    public void create(@RequestBody DateProductsEntityDto dateProductsEntityDto) {
        dateProductsEntityService.create(dateProductsEntityDto);
    }

    @GetMapping
    public ResponseEntity<List<DateProductsEntityDto>> getAll() {
        List<DateProductsEntityDto> list = dateProductsEntityService.getAll();
        return ResponseEntity.ok(list);
    }
}
