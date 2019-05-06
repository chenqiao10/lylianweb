package com.yijie.yilian.client.config;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.yijie.yilian.client.model.User;
import com.yijie.yilian.client.service.UserHandleService;

public class MyRealm extends AuthorizingRealm{
	
	
	@Autowired
	private UserHandleService userHandleService;
	

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	//认证
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken arg0) throws AuthenticationException {
		UsernamePasswordToken token = (UsernamePasswordToken) arg0;
		User user = new User();
		user.setNum(token.getUsername());
		User u = userHandleService.userLogin(user);
		if(u == null){
			// 用户不存在
			return null;
		}
		//返回密码
		return new SimpleAuthenticationInfo(u,u.getPassword(),"");
	}
	
	

}
