package com.Gold.s.Gym.Management.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Gold.s.Gym.Management.Model.Member;
import com.Gold.s.Gym.Management.Repository.MemberRepository;

@Service
public class MemberServiceImpl  implements MemberService{
	
	@Autowired
	private MemberRepository memberRepo;
	
	public void save(Member m) {
		memberRepo.save(m);
	}
	
	public List<Member> getAllMember() {
		return memberRepo.findAll();
	}
	
	public Member getMemberById(int id) {
		return memberRepo.findById(id).get();
	}
	
	public void deleteById(int id) {
		memberRepo.deleteById(id);
	}
}
