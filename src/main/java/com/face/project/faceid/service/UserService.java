package com.face.project.faceid.service;

import com.face.project.faceid.entity.SystemUser;

public interface UserService {
   SystemUser loginCheck(Long username,String password);
}
