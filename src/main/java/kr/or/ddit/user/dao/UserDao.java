package kr.or.ddit.user.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.or.ddit.mybatis.MyBatisUtil;
import kr.or.ddit.user.model.UserVO;

public class UserDao implements IuserDao{
	
	private static final Logger logger = LoggerFactory.getLogger(UserDao.class);
	
	public static void main(String[] args) {
		
		/***Given***/
		IuserDao userDao = new UserDao();
		
		/***When***/
		List<UserVO> userList =  userDao.userList();
		UserVO getUser = userDao.getUser("brown");
		
		/***Then***/
		logger.debug("userList : {}", userList);
		logger.debug("getUser : {}", getUser);
		
	}

	/**
	 * 
	* Method : userList
	* 작성자 : PC09
	* 변경이력 :
	* @return
	* Method 설명 : 사용자 전체 조회
	 */
	@Override
	public List<UserVO> userList() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		List<UserVO> userList =  sqlSession.selectList("user.userList");
		
		return userList;
	}

	
	/**
	 * 
	* Method : getUser
	* 작성자 : PC09
	* 변경이력 :
	* @param userId
	* @return
	* Method 설명 : 사용자 정보 조회
	 */
	@Override
	public UserVO getUser(String userId) {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		UserVO user = sqlSession.selectOne("user.getUser",userId);
		
		return user;
	}
}
