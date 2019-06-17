package kr.or.ddit.core.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.or.ddit.controller.Controller;
import kr.or.ddit.controller.MainController;
import kr.or.ddit.controller.UserListController;
import kr.or.ddit.db.model.DbVO;
import kr.or.ddit.db.service.DbService;
import kr.or.ddit.db.service.IDbService;

public class RequestMapping {

	// /main.do -> MainController
	// /userList.do -> UserListController

	private static final Logger logger = LoggerFactory
			.getLogger(RequestMapping.class);
	// private static Map<String, String> requestMappingClass;
	private static Map<String, Controller> requestMapping;
	private static IDbService dbService = new DbService();

	static {
		List<DbVO> urlClassMappingList = dbService.selectDbList();

		requestMapping = new HashMap<String, Controller>();

		for (DbVO vo : urlClassMappingList) {
			String classInfo = vo.getClassName();
			try {
				Class clazz = Class.forName(classInfo);
				Object obj = clazz.newInstance();
				requestMapping.put(vo.getUri(), (Controller) obj);

			} catch (ClassNotFoundException e) { // class가 없을 때 발생하는 예외처리
				e.printStackTrace();
			} catch (InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}

		}

		// requestMappingClass = new HashMap<String, String>();
		// requestMappingClass.put("/main.do",
		// "kr.or.ddit.controller.MainController");

		// for(String key : requestMappingClass.keySet()){
		//
		// //classInfo : "kr.or.ddit.controller.MainController"
		// String classInfo = requestMappingClass.get(key);
		// try {
		// Class clazz = Class.forName(classInfo);
		// Object obj = clazz.newInstance();
		// requestMapping.put(key, (Controller)obj);
		//
		// } catch (ClassNotFoundException e) { //class가 없을 때 발생하는 예외처리
		// e.printStackTrace();
		// } catch (InstantiationException | IllegalAccessException e) {
		// e.printStackTrace();
		// }

		// Integer i = new Integer(5);

		// requestMapping.put("/main.do", new MainController());
		// requestMapping.put("/userList.do", new UserListController());

	}

	public static Controller getController(String uri) {
		logger.debug("getController : {}", uri);
		return requestMapping.get(uri);
	}

}
