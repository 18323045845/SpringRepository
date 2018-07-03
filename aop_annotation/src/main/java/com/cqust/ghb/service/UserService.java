package com.cqust.ghb.service;

import com.cqust.ghb.dao.UserDao;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//这里不写名字@Service(别名)，那就是默认类名小写首字母，userService
@Service
public class UserService {

    private Logger logger=Logger.getLogger(this.getClass());

    @Autowired
    UserDao ud;

    public void getList(){
        logger.info("query");
        ud.query();
    }

}
