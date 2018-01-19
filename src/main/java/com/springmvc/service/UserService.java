package com.springmvc.service;


import com.springmvc.entity.User;

import java.util.List;

/**
 * Created by yalei.tian on 2018-01-16
 * 用户service接口
 */
public interface UserService {

	/**
	 * 	Created by yalei.tian on 2018-01-16
	 * 	根据用户名和密码查询用户
	 * @param username
	 * @param password
	 * @return
	 */
	public User findByUsernameAndPwd(String username, String password);

	/**
	 * 	Created by yalei.tian on 2018-01-16
	 * 	获取用户
	 * @return
	 */
	public List<User> find(User User);

	/**
	 * 	Created by yalei.tian on 2018-01-16
	 * 	新增
	 * @param User
	 */
	public void add(User User);
	
	/**
	 * 	Created by yalei.tian on 2018-01-16
	 * 	修改
	 * @param User
	 */
	public void update(User User);

	/**
	 * 	Created by yalei.tian on 2018-01-16
	 * 	删除
	 * @param id
	 */
	public void delete(String id);
}
