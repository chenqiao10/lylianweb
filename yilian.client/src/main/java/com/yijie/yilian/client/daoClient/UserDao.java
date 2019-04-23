package com.yijie.yilian.client.daoClient;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yijie.yilian.client.model.Projects;
import com.yijie.yilian.client.model.User;
import com.yijie.yilian.client.model.UserChangeProject;
/**
 * 用户数据接口
 * @author chenqiao
 *
 */
@FeignClient("yilian.data.client")
public interface UserDao {
	@RequestMapping("/user/userLogin")
	public User userLogin(User user);
	@RequestMapping("/user/userTable")
	public User userTable(User user);
	@RequestMapping("/user/userRegist")
	public Integer userRegist(User user);
	@RequestMapping("/user/userUpdate")
	public Integer userUpdate(User user);
   
}
