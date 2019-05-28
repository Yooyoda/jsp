package kr.or.ddit.user.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.or.ddit.paging.model.PageVO;
import kr.or.ddit.user.dao.IuserDao;
import kr.or.ddit.user.dao.UserDao;
import kr.or.ddit.user.model.UserVO;

public class UserService implements IuserService {

	IuserDao userDao = new UserDao();

	/**
	 * 
	 * Method : userList 작성자 : PC09 변경이력 :
	 * 
	 * @return Method 설명 : 사용자 전체 리스트 조회
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
		UserVO user;
		user = userDao.getUser(userId);

		return user;
	}

	@Override
	public Map<String, Object> userPagingList(PageVO pagevo) {
		//1. List<UserVO> , userCnt를 필드로 하는 vo
		//2. List<Object> resultlist - bew ArratList<Object>();
		//	 resultlist.add(userList)
		//	 resultlist.add(userCnt)
		//3. Map<String,Object> resultMap = new HaspMap<String,Object>();
		//	 resultMap.put("userList",userList)
		//	 resultMap.put("userCnt",userCnt)
		
//		List<UserVO> userList;
//		userList = userDao.userPagingList(pagevo);
		Map<String, Object> resultMap = new HashMap<String, Object>();

		resultMap.put("userList",userDao.userPagingList(pagevo));
		
		//usersCnt --> paginationSize 변경
//		resultMap.put("usersCnt",userDao.usersCnt());
		int usersCnt = userDao.usersCnt();
		//pageSize --> pageVO.getPageSize();
		int paginationSize = (int)Math.ceil((double)usersCnt/pagevo.getPageSize());
		resultMap.put("paginationSize",paginationSize);
		
		return resultMap;
	}

	@Override
	public int usersCnt() {
		int cnt = userDao.usersCnt();
		return cnt;
	}

}
