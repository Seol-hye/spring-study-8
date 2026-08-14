package com.app.service.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.common.CommonCode;
import com.app.dao.user.UserDAO;
import com.app.dto.user.User;
import com.app.service.user.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO userDAO;

	@Override
	public int saveUser(User user) {

		int result = userDAO.saveUser(user);

		return result;
	}

	@Override
	public int saveCustomerUser(User user) {

		// 사용자 계정 추가시 사용 메소드
		// 고객계정으로 추가
		//user.setUserType("CUS");
		user.setUserType( CommonCode.USER_USERTYPE_CUSTOMER );

		int result = userDAO.saveUser(user);

		return result;
	}

	@Override
	public int saveAdminUser(User user) {
		
		// 관리자 계정 추가시 사용 메소드
		// 관리자계정으로 추가
		//user.setUserType("ADM");
		user.setUserType( CommonCode.USER_USERTYPE_ADMIN );

		int result = userDAO.saveUser(user);

		return result;
	}

	@Override
	public List<User> finduserList() {
	
		List<User> userList = userDAO.finduserList();
		
		return userList;
	}

	@Override
	public User checkUserLogin(User user) {
		// 사용자 id pw <--> DB에 있는 계정정보 일치?
		
		// 해당 id로 DB에서 계정정보르 조회 <-> id pw 비교
		
		User loginUser = userDAO.findUserById( user.getId());
		
		//if(loginUser == null) //아이디가 없다
		// loginUser != null -> pw 비교 -> 틀렸다 -> 아이디는 있는데, 비번이 틀렸다
		
		//다 성공일 때만 user 객체 리턴
		if(loginUser != null //해당 id로 DB에 데이터가 있다
				&& user.getPw().equals(loginUser.getPw()) //비번이 일치한다
				&& user.getUserType().equals(loginUser.getUserType()) //userType 일치한다
				) {
			//로그인 성공
			return loginUser;
		}
		
		//로그인 실패시
		return null;
	}

	@Override
	public User findUserById(String id) {
		User user = userDAO.findUserById(id);
		return user;
	}

}
