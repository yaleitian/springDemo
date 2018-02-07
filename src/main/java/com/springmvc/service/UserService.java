package com.springmvc.service;


import com.springmvc.entity.User;
import org.springframework.web.multipart.MultipartFile;

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
	 User findByUsernameAndPwd(String username, String password);

	/**
	 * 	Created by yalei.tian on 2018-01-16
	 * 	获取用户
	 * @return
	 */
	 List<User> find(User User);

	/**
	 * 	Created by yalei.tian on 2018-01-16
	 * 	新增
	 * @param User
	 */
	 void add(User User);
	
	/**
	 * 	Created by yalei.tian on 2018-01-16
	 * 	修改
	 * @param User
	 */
	 void update(User User);

	/**
	 * 	Created by yalei.tian on 2018-01-16
	 * 	删除
	 * @param id
	 */
	 void delete(String id);

    /**
     * 上传方法接口
     */
    void beginUpload(MultipartFile file);
}
