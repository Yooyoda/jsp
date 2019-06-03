package kr.or.ddit.user.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.user.model.UserVO;
import kr.or.ddit.user.service.IuserService;
import kr.or.ddit.user.service.UserService;

/**
 * Servlet implementation class UserModifyController
 */
@WebServlet("/userModify")
public class UserModifyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	IuserService userService ;
	
	@Override
	public void init() throws ServletException {
		userService = new UserService();
	}
    String userId=null;
	//사용자 수정 화면 요청
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		userId = request.getParameter("userId");
		UserVO user = userService.getUser(userId);
		request.setAttribute("userVo", user);
		
		
		request.getRequestDispatcher("/user/userModify.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		String  name    = request.getParameter("name");
		String  alias   = request.getParameter("alias");
		String  addr1   = request.getParameter("addr1");
		String  addr2   = request.getParameter("addr2");
		String  zipcd   = request.getParameter("zipcd");
		String  birth   = request.getParameter("birth");
		String  pass    = request.getParameter("pass");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		
		UserVO userVo=null;
		try {
			userVo = new UserVO(name, userId, alias, pass, addr1, addr2, zipcd, sdf.parse(birth));
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		int updatecnt = userService.updateUser(userVo);
		
		if(updatecnt != 0) {
		
			response.sendRedirect(request.getContextPath() + "/userPagingList");
			
		}
		
		
	}

}
