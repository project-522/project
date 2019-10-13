package org.power.dao;

import org.apache.ibatis.annotations.Select;
import org.power.entity.User;

/**
 * 
 * @Title: UserDao.java
 * @Package:org.power.dao
 * @Description:(用户dao)
 * @author:LJQ
 * @date:2019年10月13日
 * @version:V1.0
 */
public interface UserDao {
	@Select("")
	public User userLogin(String username, String password);
}
