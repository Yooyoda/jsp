package kr.or.ddit.user.service;

import java.util.ArrayList;
import java.util.List;

import kr.or.ddit.user.dao.IuserDao;
import kr.or.ddit.user.dao.UserDao;
import kr.or.ddit.user.model.UserVO;

public class UserService implements IuserService{

	IuserDao userDao = new UserDao();
	/**
	 * 
	* Method : userList
	* 작성자 : PC09
	* 변경이력 :
	* @return
	* Method 설명 : 사용자 전체 리스트 조회
	 */
	@Override
	public List<UserVO> userList() {
		// db에서 데이터를 조회했다고 가정
		List<UserVO> userList = new ArrayList<UserVO>();
		
		userList = userDao.userList();
		
		return userList;
	}

	@Override
	public UserVO getUser(String userId) {
		UserVO user ;
		user = userDao.getUser(userId);
		
		return user;
	}
	
	
	

}
