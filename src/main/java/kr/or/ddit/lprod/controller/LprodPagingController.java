package kr.or.ddit.lprod.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.lprod.model.LprodVO;
import kr.or.ddit.lprod.service.ILprodService;
import kr.or.ddit.lprod.service.LprodService;
import kr.or.ddit.paging.model.PageVO;

/**
 * Servlet implementation class LprodPagingController
 */
@WebServlet("/lprodPaging")
public class LprodPagingController extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	private ILprodService lprodService;
	
	

	@Override
	public void init() throws ServletException {
		lprodService = new LprodService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page1 = null;
		String pageSize1 = null;
	
		int page=0;
		int pageSize=0;
		
		if(page1 ==null && pageSize1 == null) {
			page = 1;
			pageSize = 5;
			
		}else {
			page = Integer.parseInt(page1);
			pageSize = Integer.parseInt(pageSize1);
			
		}
		
		PageVO pagevo = new PageVO(page, pageSize);
		
		Map<String, Object> resultMap = lprodService.lprodPagingList(pagevo);
		List<LprodVO> lprodlist = (List<LprodVO>) resultMap.get("lprodList");
		int paginationSize = (Integer) resultMap.get("paginationSize");
		
		request.setAttribute("lprodList", lprodlist);
		request.setAttribute("paginationSize", paginationSize);
		request.setAttribute("pageVO", pagevo);
		request.getRequestDispatcher("/lprod/lprod.jsp").forward(request, response);
		
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
