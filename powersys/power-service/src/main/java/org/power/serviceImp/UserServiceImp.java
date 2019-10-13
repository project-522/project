package org.power.serviceImp;

import org.apache.catalina.User;
import org.power.dao.UserDao;
import org.power.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j;


@Service
@Log4j
public class UserServiceImp implements UserService{
	@Autowired
	private UserDao userDao;
	@Override
	public boolean userLogin(User user) {
		boolean flag=false;
		log.info("执行此方法");
		//return userDao.userLogin(user, password);
		return flag;
	}
	
}
