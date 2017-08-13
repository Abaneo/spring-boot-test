package pers.yf.spring_boot_stest.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import pers.yf.spring_boot_stest.entity.User;
import pers.yf.spring_boot_stest.mapper.UserMapper;

@Repository
//@EnableAutoConfiguration
public class UserService {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	UserMapper mapper;
	
	public List<Map<String, Object>> get(){
		String sql="select id,name,age from sys_user ";
		return jdbcTemplate.queryForList(sql);
	}
	
	public List<User> getList(){
		return mapper.selectAll();
		
	}
}
