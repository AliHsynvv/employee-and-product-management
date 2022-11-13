package com.company.sintra.service.impl;

import com.company.sintra.dto.ProductEntityDto;
import com.company.sintra.entity.ProductEntity;
import com.company.sintra.repository.ProductEntityRepository;
import com.company.sintra.service.ProductEntityService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductEntityServiceImpl implements ProductEntityService {

    private final ProductEntityRepository productEntityRepository;
    private final ModelMapper modelMapper;

    @Override
    public void create(ProductEntityDto productEntityDto) {

    }

    @Override
    public List<ProductEntityDto> getAll() {
        List<ProductEntity> productEntityList = productEntityRepository.findAll();

        return productEntityList.stream().map(productEntity -> modelMapper.map(productEntity, ProductEntityDto.class))
                .collect(Collectors.toList());
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
