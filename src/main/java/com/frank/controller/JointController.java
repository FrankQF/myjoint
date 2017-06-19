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
	
	@Autowired//�Զ���JointService����ע��,�����Ҫ�Ƚ���Spring����ſ����Զ�ע��
	private JointService jointService;
	
	
	@RequestMapping("{group}/{funcid}.action")
	@ResponseBody//��Controller�ķ������صĶ���ͨ���ʵ���HttpMessageConverterת��Ϊָ����ʽ��д�뵽Response�����body������
	public Object group(@PathVariable("group") String group,@PathVariable("group") String funcid,
			@RequestBody String param
			){
		//@PathVariable ��urlռλ�������
		//@RequestBody ��ȡrequest����body�������ݣ�ʹ��Ĭ�ϵ�HttpMessageConverter���н���
		User user=new User();
		user.setName(group);
		user.setAge(funcid);
		
		return user;
	}
}
