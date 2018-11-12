package com.lc.mybatis;

import com.lc.mybatis.domain.User;
import com.lc.mybatis.mapper.UserMapper;
import com.lc.mybatis.utils.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.UUID;

public class MyBatisTest {
	@Test
	public void createTest() {
		SqlSession session = SqlSessionFactoryUtil.getSqlSessionFactory().openSession(true);
		try {
			String uuid = UUID.randomUUID().toString();
			User user = new User(uuid, "kity", 19);
			int result =  session.insert("com.lc.mybatis.mapper.UserMapper.addUser", user);
			System.out.println(result);
		} finally {
			session.close();
		}
	}
	
	@Test
	public void updateTest() {
		SqlSession session = SqlSessionFactoryUtil.getSqlSessionFactory().openSession(true);
		try {
			User user = session.selectOne("com.lc.mybatis.mapper.UserMapper.getUser", "1c2c9bac-e3c7-4d8f-a98f-3b2c9c19b1ec");
			user.setName("ketiy");
			int result =  session.update("com.lc.mybatis.mapper.UserMapper.updateUser", user);
			System.out.println(result);
		} finally {
			session.close();
		}
	}
	
	@Test
	public void deleteTest() {
		SqlSession session = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
		try {
			int result = session.delete("com.lc.mybatis.mapper.UserMapper.deleteUser", "08e6b39c-237f-49e2-9c65-2d90d1be7f97");
			session.commit();
			System.out.println(result);
		} finally {
			session.close();
		}
	}

	@Test
	public void readTest() {
		SqlSession session = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
		try {
			User user = session.selectOne("com.lc.mybatis.mapper.UserMapper.getUser", "1c2c9bac-e3c7-4d8f-a98f-3b2c9c19b1ec");
			System.out.println(user.toString());
		} finally {
			session.close();
		}
	}
	
	@Test
	public void readAllTest() {
		SqlSession session = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
		try {
			List<User> userList = session.selectList("com.lc.mybatis.mapper.UserMapper.getAllUser");
			for (User user : userList) {			
				System.out.println(user.toString());
			}
		} finally {
			session.close();
		}
	}
	
	/**********************************************************************************************************/
	
	@Test
	public void createTest2() {
		SqlSession session = SqlSessionFactoryUtil.getSqlSessionFactory().openSession(true);
		try {
			String uuid = UUID.randomUUID().toString();
			User user = new User(uuid, "kityyyyyyy", 19);
			UserMapper userMapper = session.getMapper(UserMapper.class);
			userMapper.addUser(user);
		} finally {
			session.close();
		}
	}
	
	@Test
	public void updateTest2() {
		SqlSession session = SqlSessionFactoryUtil.getSqlSessionFactory().openSession(true);
		try {
			UserMapper userMapper = session.getMapper(UserMapper.class);
			User user = userMapper.getUser("1c2c9bac-e3c7-4d8f-a98f-3b2c9c19b1ec");
			user.setName("ketiy");
			userMapper.updateUser(user);
		} finally {
			session.close();
		}
	}
	
	@Test
	public void deleteTest2() {
		SqlSession session = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
		try {
			UserMapper userMapper = session.getMapper(UserMapper.class);
			userMapper.deleteUser("08e6b39c-237f-49e2-9c65-2d90d1be7f97");
			session.commit();
		} finally {
			session.close();
		}
	}

	@Test
	public void readTest2() {
		SqlSession session = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
		try {
			UserMapper userMapper = session.getMapper(UserMapper.class);
			User user = userMapper.getUser("1c2c9bac-e3c7-4d8f-a98f-3b2c9c19b1ec");
			System.out.println(user.toString());
		} finally {
			session.close();
		}
	}
	
	@Test
	public void readAllTest2() {
		SqlSession session = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
		try {
			UserMapper userMapper = session.getMapper(UserMapper.class);
			List<User> userList = userMapper.getAllUser();
			for (User user : userList) {			
				System.out.println(user.toString());
			}
		} finally {
			session.close();
		}
	}
}
