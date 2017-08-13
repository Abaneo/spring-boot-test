package pers.yf.spring_boot_stest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import pers.yf.spring_boot_stest.entity.User;

public interface UserMapper {
	
	public List<User> selectAll();
}
