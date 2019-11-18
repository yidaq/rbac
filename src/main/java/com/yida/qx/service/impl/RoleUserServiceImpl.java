package com.yida.qx.service.impl;

import com.yida.qx.base.result.Results;
import com.yida.qx.dao.RoleUserDao;
import com.yida.qx.model.SysRoleUser;
import com.yida.qx.service.RoleUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleUserServiceImpl implements RoleUserService {
    @Autowired
    private RoleUserDao roleUserDao;

    @Override
    public Results getSysRoleUserByUserId(Integer userId) {
        SysRoleUser sysRoleUser = roleUserDao.getSysRoleUserByUserId(userId);
        if(sysRoleUser != null){
            return Results.success(sysRoleUser);
        }else{
            return Results.success();
        }
    }
}
