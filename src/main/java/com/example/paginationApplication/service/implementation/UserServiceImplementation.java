package com.example.paginationApplication.service.implementation;


import com.example.paginationApplication.domain.User;
import com.example.paginationApplication.repository.UserRepository;
import com.example.paginationApplication.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

import static org.springframework.data.domain.PageRequest.of;


@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class UserServiceImplementation implements UserService {
    private final UserRepository userRepository;

    @Override
    public Page<User> getUsers(String name, int page, int size) {
        log.info("Fetching users for page {} of size {}", page, size);
        return userRepository.findByNameContaining(name, of(page, size));
    }
}
