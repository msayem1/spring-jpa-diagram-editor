package com.msayem.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * Role Data Model (i.e. Entity) class.
 * 
 * @author MSAYEM
 * 
 */
@Entity
public class Role {

	@Id
	@GeneratedValue
	private Integer roleid;
	private String rolename;
	
	@ManyToMany(mappedBy="role")
	private List<User> user;
	
	public Integer getRoleid() {
		return roleid;
	}
	public void setUserid(Integer roleid) {
		this.roleid = roleid;
	}
	public String getRolename() {
		return rolename;
	}
	public void setUsername(String rolename) {
		this.rolename = rolename;
	}
	
	public List<User> getUser() {
		return user;
	}
	public void setUsers(List<User> user) {
		this.user = user;
	}
}