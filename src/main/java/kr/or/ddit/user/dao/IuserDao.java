package kr.or.ddit.user.dao;

import java.util.List;
import java.util.Map;

import kr.or.ddit.paging.model.PageVO;
import kr.or.ddit.user.model.UserVO;

public interface IuserDao {

	/**
	 * 
	* Method : userList
	* 작성자 : PC09
	* 변경이력 :
	* @return
	* Method 설명 : 사용자 전체 조회
	 */
	List<UserVO> userList();
	
	/**
	 * 
	* Method : getUser
	* 작성자 : PC09
	* 변경이력 :
	* @param userId
	* @return
	* Method 설명 : 사용자 정보 조회
	 */
	UserVO getUser(String userId);
	
	/**
	 * 
	* Method : userPagingList
	* 작성자 : PC09
	* 변경이력 :
	* @param pagevo
	* @return
	* Method 설명 : 사용자 페이징 리스트 조회
	 */
	List<UserVO> userPagingList(PageVO pagevo);
	
	/**
	 * 
	* Method : usersCnt
	* 작성자 : PC09
	* 변경이력 :
	* @return
	* Method 설명 : 사용자 전체수 조회
	 */
	int usersCnt();
}
