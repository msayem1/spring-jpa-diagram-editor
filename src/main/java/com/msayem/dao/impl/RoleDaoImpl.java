package com.msayem.dao.impl;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.msayem.entity.Role;
import com.msayem.dao.RoleDao;

/**
 * Role DAO Implementation class.
 * 
 * @author MSAYEM
 * 
 */
public class RoleDaoImpl implements RoleDao {
	
	private SessionFactory sessionFactory;
	
	public RoleDaoImpl(SessionFactory sessionFactory) {
		
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public List<Role> listRole() {
		
		@SuppressWarnings("unchecked")
		List<Role> listUser = (List<Role>) sessionFactory.getCurrentSession()
			.createCriteria(Role.class)
			.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list(); 
		
		return listUser;
	}
}