package com.daffy3.ch10.domain.userinfo.dao.oracle;

import com.daffy3.ch10.domain.userinfo.UserInfo;
import com.daffy3.ch10.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert Into ORACLE DB. userId = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Update Into ORACLE DB. userId = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Delete From ORACLE DB. userId = " + userInfo.getUserId());
    }
}
