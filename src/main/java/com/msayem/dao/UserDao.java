package com.msayem.dao;

import java.util.List;
import com.msayem.entity.User;

/**
 * Interface for User DAO Implementation.
 * 
 * @author MSAYEM
 * 
 */
public interface UserDao {
	
	public List<User> listUser();
}