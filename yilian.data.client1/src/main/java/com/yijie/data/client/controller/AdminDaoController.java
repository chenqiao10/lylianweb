package com.yijie.data.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yijie.data.client.model.Admin;
import com.yijie.data.client.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminDaoController {
	 @Autowired 
	 AdminService adminService;
	//管理员列表查找
	   @RequestMapping("/adminSelect")
	   public List<Admin> adminSelect(@RequestBody Admin admin) {
		  return adminService.adminSelect(admin);
		   
	   }
	   //管理员更新
	   @RequestMapping("/adminUpdate")
	   public Integer adminUpdate(@RequestBody Admin admin) {
		   
		 return  adminService.adminUpdate(admin);
		   
	   }
	 //管理员删除
	   @RequestMapping("/adminDelete")
	   public Integer adminDelect(@RequestBody Admin admin) {
		   
		 return  adminService.adminDelete(admin);
		   
	   }
	 //管理员增加
	   @RequestMapping("/adminInsert")
	   public Integer adminInsert(@RequestBody Admin admin) {
		   
		 return  adminService.adminInsert(admin);
		   
	   }
	   @RequestMapping("/adminLogin")
	   public Admin adminLogin(@RequestBody Admin admin) {
		   return adminService.adminLogin(admin);
		   
		   
	   }
}
