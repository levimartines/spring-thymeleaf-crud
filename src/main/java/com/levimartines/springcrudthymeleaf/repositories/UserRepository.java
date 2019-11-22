package com.levimartines.springcrudthymeleaf.repositories;

import com.levimartines.springcrudthymeleaf.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {}
