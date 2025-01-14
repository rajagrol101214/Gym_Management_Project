package com.Gold.s.Gym.Management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Gold.s.Gym.Management.Model.MyMemberList;

@Repository
public interface MyMemberRepository extends JpaRepository<MyMemberList, Integer>{

}
