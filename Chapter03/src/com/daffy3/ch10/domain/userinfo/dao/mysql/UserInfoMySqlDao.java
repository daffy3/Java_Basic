package com.daffy3.ch10.domain.userinfo.dao.mysql;

import com.daffy3.ch10.domain.userinfo.UserInfo;
import com.daffy3.ch10.domain.userinfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert Into MySQL DB. userId = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Update Into MySQL DB. userId = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Delete From MySQL DB. userId = " + userInfo.getUserId());
    }
}
