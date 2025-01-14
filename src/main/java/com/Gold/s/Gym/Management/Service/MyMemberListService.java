package com.Gold.s.Gym.Management.Service;

import java.util.List;

import com.Gold.s.Gym.Management.Model.MyMemberList;

public interface MyMemberListService {
	
	public void saveMyMembers(MyMemberList member);
	
	public List<MyMemberList> getAllMyMembers();
	
	public void deleteById(int id);
}
