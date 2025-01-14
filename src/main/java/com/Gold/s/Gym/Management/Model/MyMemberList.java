package com.Gold.s.Gym.Management.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="MyMembers")
public class MyMemberList {
	
	@Id
	private int id;
	private String name;
	private String address;
	private String emailId;
	private long phoneNo;
	private String plan;
}
