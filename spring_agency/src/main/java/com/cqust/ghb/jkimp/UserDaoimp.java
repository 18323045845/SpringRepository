package com.cqust.ghb.jkimp;

import com.cqust.ghb.jk.UserDao;

public class UserDaoimp implements UserDao {

    @Override
    public void save() {
        System.out.println("我从哪里来?");
    }
}
