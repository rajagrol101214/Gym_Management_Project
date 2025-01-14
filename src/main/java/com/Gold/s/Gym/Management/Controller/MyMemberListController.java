package com.Gold.s.Gym.Management.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Gold.s.Gym.Management.Service.MyMemberListServiceImpl;

@Controller
public class MyMemberListController {
	
	@Autowired
	private MyMemberListServiceImpl service;
	
	@RequestMapping("/deleteMyList/{id}")
	public String deleteMyList(@PathVariable("id") int id) {
		service.deleteById(id);
		return "redirect:/my_members";
	}
	
}
