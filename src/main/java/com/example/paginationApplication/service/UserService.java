package com.example.paginationApplication.service;
import com.example.paginationApplication.domain.User;
import org.springframework.data.domain.Page;

public interface UserService {
    Page<User> getUsers(String name, int page, int size);

}
