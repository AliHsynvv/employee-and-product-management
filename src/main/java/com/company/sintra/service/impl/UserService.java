package com.company.sintra.service.impl;

import com.company.sintra.dto.EmployeesEntityDto;
import com.company.sintra.entity.EmployeesEntity;
import com.company.sintra.entity.User;
import com.company.sintra.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void create(User user) {
        userRepository.save(user);

    }
}
