package com.company.sintra;

import com.company.sintra.config.JwtService;
import com.company.sintra.entity.Authority;
import com.company.sintra.entity.Role;
import com.company.sintra.entity.User;
import com.company.sintra.repository.AuthorityRepository;
import com.company.sintra.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Set;

@SpringBootApplication
@RequiredArgsConstructor
@Slf4j
public class ProductRezApplication implements CommandLineRunner {
    private final UserRepository userRepository;
    private final PasswordEncoder encoder;
    public final AuthorityRepository authorityRepository;
    private final JwtService jwtService;

    public static void main(String[] args) {
        SpringApplication.run(ProductRezApplication.class, args);


    }

    @Override
    public void run(String... args) throws Exception {


        Authority a = new Authority();
        a.setRole(Role.MANAGER);

        authorityRepository.save(a);
        User user = User.builder()
                .username("Rashad")
                .password("12345")
                .isAccountNonExpired(true)
                .isAccountNonLocked(true)
                .isCredentialsNonExpired(true)
                .isEnabled(true)
                .authorities(Set.of(a))
                .build();

        userRepository.save(user);

    }

}

