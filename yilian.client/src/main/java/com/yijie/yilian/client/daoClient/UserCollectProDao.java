package com.yijie.yilian.client.daoClient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yijie.yilian.client.DataClientFall.UserCollectDaoClientFallBack;
import com.yijie.yilian.client.model.UserCollectProject;

/**
 * 我的收藏
 * 
 * @author chenqiao
 *
 */
@FeignClient(name="yijie.zuul.api", fallback=UserCollectDaoClientFallBack.class)
public interface UserCollectProDao {

	// 收藏列表
	@RequestMapping("yilianData/user/userColProTable")
	public List<UserCollectProject> userColProTable(UserCollectProject userCollectProject);

	// 添加收藏
	@RequestMapping("yilianData/user/userColProAdd")
	public Integer userColProAdd(UserCollectProject userCollectProject);

	// 删除收藏
	@RequestMapping("yilianData/user/userColProDelete")
	public Integer userColProDelete(UserCollectProject userCollectProject);
}
