package com.wj.prajumsook.controller;


import com.wj.prajumsook.entity.User;
import com.wj.prajumsook.service.UserService;
import io.reactivex.Single;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log4j2
@RestController
@RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
public class UserController
{   @Autowired
    private UserService userService;

    @GetMapping("/all")
    public Single<List<User>> findAll()
    {
        return userService.listAll();
    }
}