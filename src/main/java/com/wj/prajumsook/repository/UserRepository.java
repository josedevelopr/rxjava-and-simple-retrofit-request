package com.wj.prajumsook.repository;

import com.wj.prajumsook.entity.User;
import org.springframework.data.repository.reactive.RxJava2CrudRepository;

public interface UserRepository extends RxJava2CrudRepository<User, String> {}
