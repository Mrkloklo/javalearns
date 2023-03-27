package com.sbr.chap6;

import com.sbr.chap6.dao.UserDao;
import com.sbr.chap6.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

import java.util.List;

public class test3 {
    @Test
    public  void  test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("chap6/springchap6.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");
        User user = new User();
        user.setUsername("gou1");
        user.setPassword("wolf");
        userDao.addUsers(user);
        userDao.deleteUser("gou");
        List<User> mapper = userDao.selUsers();

        for (User item:mapper) {
            System.out.println(item.toString());
        }



    }
}
