package com.face.project.faceid.service.impl;

import com.face.project.faceid.dao.UserDao;
import com.face.project.faceid.entity.SystemUser;
import com.face.project.faceid.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    @Override
    public SystemUser loginCheck(Long username, String password) {
        return userDao.selectById(username);
    }
}
