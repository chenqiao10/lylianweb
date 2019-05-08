package com.yijie.yilian.client.daoClient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yijie.yilian.client.DataClientFall.USerCheProDaoClientFallback;
import com.yijie.yilian.client.model.UserChangeProject;

/**
 * 项目交换接口
 * 
 * @author chenqiao
 *
 */
@FeignClient(name="yijie.zuul.api", fallback=USerCheProDaoClientFallback.class)

public interface UserCheProDao {
	
	// 用户项目交换列表
	@RequestMapping("yilianData/user/userCheProTable")
	public List<UserChangeProject> userCheProTable(UserChangeProject userChangeProject);

	// 删除交换项目
	@RequestMapping("yilianData/user/userCheProDelete")
	public Integer userCheProDelete(UserChangeProject userChangeProject);

	// 添加交换项目
	@RequestMapping("yilianData/user/userCheProAdd")
	public Integer userCheProAdd(UserChangeProject userChangeProject);

}
