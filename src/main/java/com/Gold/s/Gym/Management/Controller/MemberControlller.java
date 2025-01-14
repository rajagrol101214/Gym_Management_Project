package com.Gold.s.Gym.Management.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.Gold.s.Gym.Management.Model.Member;
import com.Gold.s.Gym.Management.Model.MyMemberList;
import com.Gold.s.Gym.Management.Service.MemberServiceImpl;
import com.Gold.s.Gym.Management.Service.MyMemberListServiceImpl;


@Controller
public class MemberControlller {
	
	@Autowired
	private MemberServiceImpl service;
	
	@Autowired
	private MyMemberListServiceImpl myMemberService;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/member_register")
	public String memberRegister() {
		return "memberRegister";
	}
	
	@GetMapping("/available_members")
	public ModelAndView getAllMember() {
		List<Member> list = service.getAllMember();
		ModelAndView m = new ModelAndView();
		m.setViewName("memberList");
		m.addObject("member",list);
		return m;
	}
	
	@PostMapping("/save")
	public String addMember(@ModelAttribute Member m) {
		service.save(m);
		return "redirect:/available_members";
	}
	
	@GetMapping("/my_members")
	public String getMyMembers(Model model) {
		List<MyMemberList> list = myMemberService.getAllMyMembers();
		model.addAttribute("member",list);
		return "myMembers";
	}
	
	@RequestMapping("/mylist/{id}")
	public String getMyList(@PathVariable("id") int id) {
		Member m = service.getMemberById(id);
		MyMemberList mml = new MyMemberList(m.getId(), m.getName(), m.getAddress(), m.getEmailId(), m.getPhoneNo(), m.getPlan());
		myMemberService.saveMyMembers(mml);
		return "redirect:/my_members";
	}
	
	@RequestMapping("/editMember/{id}")
	public String editMember(@PathVariable("id") int id, Model model) {
		Member m = service.getMemberById(id);
		model.addAttribute("member",m);
		return "memberEdit";
	}
	
	@RequestMapping("/deleteById/{id}")
	public String deleteMember(@PathVariable("id") int id) {
		service.deleteById(id);
		return "redirect:/available_members";
	}
}
