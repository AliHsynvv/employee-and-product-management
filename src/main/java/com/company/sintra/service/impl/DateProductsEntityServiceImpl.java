package com.company.sintra.service.impl;

import com.company.sintra.dto.DateProductsEntityDto;
import com.company.sintra.entity.DateProductsEntity;
import com.company.sintra.entity.ProductEntity;
import com.company.sintra.repository.DateProductsEntityRepository;
import com.company.sintra.repository.ProductEntityRepository;
import com.company.sintra.service.CrudService;
import com.company.sintra.service.DateProductsEntityService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DateProductsEntityServiceImpl implements DateProductsEntityService {

    private final DateProductsEntityRepository dateProductsEntityRepositor;
    private final ProductEntityRepository productEntityRepository;

    private final ModelMapper modelMapper;

    @Override
    public void create(DateProductsEntityDto dateProductsEntityDto) {
        DateProductsEntity dateProductsEntity = DateProductsEntity.builder()
                .date(dateProductsEntityDto.getDate())
                .productsId(dateProductsEntityDto.getProductsId())
                .count(dateProductsEntityDto.getCount())
                .build();
        dateProductsEntityRepositor.save(dateProductsEntity);

        ProductEntity productEntity = productEntityRepository.findById(dateProductsEntity.getProductsId());
        int currentCount = productEntity.getCount();
        int resultCount = currentCount + dateProductsEntity.getCount();
        productEntity.setCount(resultCount);
        productEntityRepository.save(productEntity);
    }

    @Override
    public List<DateProductsEntityDto> getAll() {
        List<DateProductsEntity> dateProductsEntities = dateProductsEntityRepositor.findAll();

        return dateProductsEntities.stream().map(dateProductsEntity -> modelMapper.map(dateProductsEntity,
                DateProductsEntityDto.class)).collect(Collectors.toList());
    }

    @Override
    public void update(Integer idd, DateProductsEntityDto dateProductsEntityDto) {

    }

    @Override
    public void deleteById(Integer idd) {

    }

    @Override
    public DateProductsEntityDto findById(Integer idd) {
        return null;
    }
}
