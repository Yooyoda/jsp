package kr.or.ddit.user.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.or.ddit.paging.model.PageVO;
import kr.or.ddit.user.model.UserVO;
import kr.or.ddit.user.service.IuserService;
import kr.or.ddit.user.service.UserService;

/**
 * Servlet implementation class UserPagingController
 */
@WebServlet("/userPagingList")
public class UserPagingController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private IuserService userService;
    
    private static final Logger logger = LoggerFactory.getLogger(UserPagingController.class);
	
	@Override
	public void init() throws ServletException {
		userService = new UserService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String page1 = request.getParameter("page");
		String pageSize1 = request.getParameter("pageSize");
		
		int page = 0;
		int pageSize = 0;
		
		if (page1 == null && pageSize1 == null){
			page = 1;
			pageSize = 10;
			
		}else {
			page = Integer.parseInt(request.getParameter("page"));
			pageSize = Integer.parseInt(request.getParameter("pageSize"));
			
		}
		
		PageVO pagevo = new PageVO(page,pageSize);
		
		Map<String, Object> resultMap = userService.userPagingList(pagevo);
		List<UserVO> userlist= (List<UserVO>) resultMap.get("userList"); //몇 페이지에서 몇개 출력할지
		int paginationSize = (Integer) resultMap.get("paginationSize");
		
		request.setAttribute("userList", userlist); //속성을 정해줌
		request.setAttribute("paginationSize", paginationSize); //속성을 정해줌
		request.setAttribute("pageVO", pagevo);
		request.getRequestDispatcher("/user/userPagingList.jsp").forward(request, response);
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
