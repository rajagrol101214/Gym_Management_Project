package com.Gold.s.Gym.Management.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Gold.s.Gym.Management.Model.MyMemberList;
import com.Gold.s.Gym.Management.Repository.MyMemberRepository;

@Service
public class MyMemberListServiceImpl implements MyMemberListService{
	
	@Autowired
	private MyMemberRepository mymember;
	
	public void saveMyMembers(MyMemberList member) {
		mymember.save(member);
	}
	
	public List<MyMemberList> getAllMyMembers() {
		return mymember.findAll();
	}
	
	public void deleteById(int id) {
		mymember.deleteById(id);
	}
}
