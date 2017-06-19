package com.frank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.frank.platform.JointService;
import com.frank.platform.User;

@Controller
@RequestMapping("buis")
public class JointController {
	
	@Autowired//自动对JointService进行注入,这个类要先接受Spring管理才可以自动注入
	private JointService jointService;
	
	
	@RequestMapping("{group}/{funcid}.action")
	@ResponseBody//将Controller的方法返回的对象，通过适当的HttpMessageConverter转换为指定格式后，写入到Response对象的body数据区
	public Object group(@PathVariable("group") String group,@PathVariable("group") String funcid,
			@RequestBody String param
			){
		//@PathVariable 绑定url占位符到入参
		//@RequestBody 读取request请求body部分数据，使用默认的HttpMessageConverter进行解析
		User user=new User();
		user.setName(group);
		user.setAge(funcid);
		
		return user;
	}
}
