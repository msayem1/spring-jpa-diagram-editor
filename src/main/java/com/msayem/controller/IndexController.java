package com.msayem.controller;

import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.msayem.entity.User;
import com.msayem.entity.Role;
import com.msayem.dao.UserDao;
import com.msayem.dao.RoleDao;

/**
 * Handles requests for the application index page.
 * 
 * @author MSAYEM
 * 
 */
@Controller
public class IndexController {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private UserDao userDao;

	@Autowired
	private RoleDao roleDao;

	@RequestMapping(value = "/", method = RequestMethod.GET)      
	public String indexController(Map<String, Object> map) {

		List<User> listUser = userDao.listUser();
		List<Role> listRole = roleDao.listRole();
		
		map.put("user", new User());
		map.put("userList", listUser);
		
		map.put("role", new Role());
		map.put("roleList", listRole);
		
		logger.info("spring-jpa-diagram-editor: Loading index.jsp page...");
		
		return "index";
    }    
}