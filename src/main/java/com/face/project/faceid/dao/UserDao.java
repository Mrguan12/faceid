package com.face.project.faceid.dao;

import com.face.project.faceid.entity.SystemUser;


public interface UserDao {
    SystemUser selectById(Long id);
}
