package com.cqust.ghb.testagency;

import com.cqust.ghb.agency.ProxyFactory;
import com.cqust.ghb.jk.UserDao;
import com.cqust.ghb.jkimp.UserDaoimp;

public class Test {
    public static void main(String[] args) {
        UserDao ud=new UserDaoimp();
        //创建代理对象
        UserDao proxy= (UserDao) new ProxyFactory(ud).getProxyInstance();
        proxy.save();

    }
}
