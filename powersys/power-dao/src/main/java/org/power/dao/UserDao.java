package org.power.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.power.entity.User;
import org.springframework.stereotype.Component;

/**
 * 
 * @Title: UserDao.java
 * @Package:org.power.dao
 * @Description:(用户dao)
 * @author:LJQ
 * @date:2019年10月13日
 * @version:V1.0
 */
@Mapper
public interface UserDao {
	@Select("")
	public User userLogin(String username, String password);
}
