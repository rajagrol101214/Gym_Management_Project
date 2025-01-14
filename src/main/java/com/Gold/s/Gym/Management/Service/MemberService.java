package com.Gold.s.Gym.Management.Service;

import java.util.List;

import com.Gold.s.Gym.Management.Model.Member;

public interface MemberService {
	
	public void save(Member m);
	
	public List<Member> getAllMember();
	
	public Member getMemberById(int id);
	
	public void deleteById(int id);
}
