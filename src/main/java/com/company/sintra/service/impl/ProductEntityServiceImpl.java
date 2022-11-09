package com.company.sintra.service.impl;

import com.company.sintra.dto.ProductEntityDto;
import com.company.sintra.entity.ProductEntity;
import com.company.sintra.service.ProductEntityService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductEntityServiceImpl implements ProductEntityService {


    @Override
    public void create(ProductEntityDto productEntityDto) {

    }

    @Override
    public List<ProductEntityDto> getAll() {
        return null;
    }

    @Override
    public void update(Integer idd, ProductEntityDto productEntityDto) {

    }

    @Override
    public void deleteById(Integer idd) {

    }

    @Override
    public ProductEntityDto findById(Integer idd) {
        return null;
    }
}
