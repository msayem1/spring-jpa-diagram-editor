package com.msayem.dao.impl;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.msayem.entity.User;
import com.msayem.dao.UserDao;

/**
 * User DAO Implementation class.
 * 
 * @author MSAYEM
 * 
 */
public class UserDaoImpl implements UserDao {
	
	private SessionFactory sessionFactory;
	
	public UserDaoImpl(SessionFactory sessionFactory) {
		
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public List<User> listUser() {
		
		@SuppressWarnings("unchecked")
		List<User> listUser = (List<User>) sessionFactory.getCurrentSession()
			.createCriteria(User.class)
			.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		
		return listUser;
	}
}