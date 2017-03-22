package com.sie.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserCustom {
	//方法里不能直接传送list集合，和map集合类型参数，所以把list和map封装到包装类
//传递list集合：
//先创建一个包装类，再在包装类里定义list
	private User user;
	private List<User> userList;
	//接收map类型参数Demo
	private Map<String, Object> maps = new HashMap<String, Object>();
	
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<User> getUserList() {
		return userList;
	}
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	public Map<String, Object> getMaps() {
		return maps;
	}
	public void setMaps(Map<String, Object> maps) {
		this.maps = maps;
	}
	

}
