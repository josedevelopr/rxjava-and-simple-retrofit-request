package com.wj.prajumsook.service;

import com.wj.prajumsook.entity.User;
import io.reactivex.Single;

import java.util.List;

public interface UserService
{   public Single<List<User>> listAll();
}
