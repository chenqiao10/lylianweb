package com.yijie.yilian.client.daoClient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yijie.yilian.client.model.UserChangeProject;

/**
 * 项目交换接口
 * 
 * @author chenqiao
 *
 */
@FeignClient("yilian.data.client")
public interface UserCheProDao {
	// 用户项目交换列表
	@RequestMapping("/user/userCheProTable")
	public List<UserChangeProject> userCheProTable(UserChangeProject userChangeProject);

	// 删除交换项目
	@RequestMapping("/user/userCheProDelete")
	public Integer userCheProDelete(UserChangeProject userChangeProject);

	@RequestMapping("/user/userCheProAdd")
	// 添加交换项目
	public Integer userCheProAdd(UserChangeProject userChangeProject);

}
