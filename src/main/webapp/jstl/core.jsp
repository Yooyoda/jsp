<%@page import="kr.or.ddit.user.model.UserVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>c:set</h2>
	<!-- var : 속성명, value : 값, scope : page(default), request, session, application -->
	<%
		UserVO USER_INFO = (UserVO)session.getAttribute("USER_INFO");
		pageContext.setAttribute("userId", USER_INFO.getAlias());
	%>
	<c:set var="userId" value="${USER_INFO.alias }" scope="request"></c:set>
	userId : ${userId } <br>
	requestScope.userId : ${requestScope.userId } <br>
	 
	<!-- target 대상 속성, property : 대상 속성의 필드, value : 대입값 --> 
	<c:set target="${USER_INFO }" property="alias" value="bear"></c:set>
	USER_INFO.alias : ${USER_INFO.alias } <br>
	
	<h2>c:if *** c:if는 java의 if-else if -else중에서 if에만 해당(c:choose 태그가 일반적인 if문)</h2>
	<%--if(test) --%>
	<c:if test="${USER_INFO.userId == 'brown' }">
		userId는 brown입니다
	</c:if>
	
	<c:if test="${USER_INFO.userId == 'sally' }">
		userId는 sally입니다
	</c:if>
</body>
</html>