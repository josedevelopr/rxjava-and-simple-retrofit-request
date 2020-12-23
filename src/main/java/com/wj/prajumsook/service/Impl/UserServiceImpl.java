package com.wj.prajumsook.service.Impl;

import com.wj.prajumsook.entity.User;
import com.wj.prajumsook.repository.UserRepository;
import com.wj.prajumsook.service.UserService;
import io.reactivex.Single;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService
{   private final UserRepository userRepository;

    @Override
    public Single<List<User>> listAll() {
        return userRepository.findAll().toList();
    }
}
