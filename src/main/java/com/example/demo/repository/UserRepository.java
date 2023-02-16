package com.example.demo.repository;

import com.example.demo.dao.UserDao;
import jakarta.persistence.QueryHint;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface UserRepository extends ListCrudRepository<UserDao, String> {


    @Override
    @QueryHints(value = {@QueryHint(name = "org.hibernate.cacheable", value = "false")})
    List<UserDao> findAll();
}
