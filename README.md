<h1> JSP프로젝트 설명 </h1>

<h2>2019.5.20</h2>
 1. 개발환경 구축 <br>
 2. 서버프로그램 구현<br>
  - 이클립스 개발환경 설정(주석 템플릿)<br>
 3. BasicServlet클래스 생성, servlet mapping 등록(web xml)<br>
 4. NowDateServlet클래스 생성, servlet mapping등록(web.xml)<br>
    response content-type<br>
 5. servlet life cycle<br>
    timesServlet<br>
 6. request parameter<br>
    timesServlet request Parameter적용<br>
 
 <h2>2019.5.21</h2>
 1. maven프로젝트, 기본 서블릿 생성<br>
 2. logback설정, 사용방법<br>
 3. jsp기본 개념(page지시어, 스크립틀릿, 표현식, 주석)<br>
 4. jsp times Tables 실습<br>
 5. jsp factorial실습<br>
 6. jsp 내장객체(HttpServletRequest)<br>
 
 <h2>2019.5.22</h2>
 1. timesTables.jsp 파라미터 적용 코드 리뷰<br>
 2. request parameter 메소드 확인<br>
 3. login.jsp loginProcess.jsp<br>
 4. bootstrap login화면 적용<br>
 5. redirect ( response sendRedirect)<br>
 6. dispatch (requestDispatcher.forward(request, response)<br>
 7. login프로세스 (redirect, dispatch 적용)<br>
 6. main.jsp bootstrap적용<br>
 7. jsp 실행원리 (서블릿 변환과정)<br>
    url mapping 처리<br>
    out, application<br>
    application 객체를 통한 어플리케이션 내 자원 접근하기 실습<br>
    
 <h2>2019.5.23</h2>
 1. jsp scope객체, 속성<br>
 2. 두개의 숫자를 파라미터로 받아 합 계산하여 scope에 저장, 출력 (학생실습)<br>
 3. 사용자 리스트 메뉴 실습<br>
 4. 로그인 정보 session 저장 실습(null 처리)<br>
 5. 로그아웃 처리 실습<br>
 6. 세션정보 존재시 로그인 화면을 통한 로그인 방지 처리(메인화면 이동)<br>
 7. 페이지 모듈화(header, left, commonLib)<br>
 
 <h2>2019.5.24</h2>
 1. 로그인 프로세스 복습(학생 실습)<br>
    ( scope-세션 개념 포함)
 2. mybatis 설정(maven respository)<br>
 3. userDao userList 수정 개발<br>
    exerd 설치, users테이블 설계<br>
 4. userDao getUser 코드, 테스트 코드 개발<br>
 5. junit 필요성, 설정<br>
 6. UserService userList, getUser 코드, 테스트 코드 작성<br>
 7. user 데이터 대량 생성하기<br>
 8. userService, userDao getUser 코드 작성<br>
 9. userService, userDao getUser 테스트 코드 작성<br>
 10. 사용자 페이지 리스트 조회 쿼리 작성<br>
 
 <h2>2019.5.27</h2>
 1. 사용자 리스트 조회 mvc 복습<br>
 2. 사용자 페이지 리스트 조회 쿼리 작성<br>
 3. 사용자 페이지 리스트 조회 로직, 테스트 코드 작성(service, dao)<br>
 4. 사용자 페이지 리스트 컨트롤러 로직 작성(테스트 코드 X)<br>
 5. page, pageSize 파라미터가 없을경우 default value 처리 (page = 1, pageSize = 10)<br>
 6. pagination  처리 (usersCnt -> paginationSize 계산)<br>
 7. pagination  처리 로직에 따른 userService 로직 개선<br>
 8. pagination  처리 (usersCnt -> paginationSize 계산)<br>
 9. pagination  처리 (pagination 화면 출력, li active class 추가)<br>
 10. pagination  처리 (pagination 화면 출력, li active class 추가, 이전 페이지, 다음 페이지 가기 버튼)<br>
 
 <h2>2019.5.28</h2>
 1. 웹 프로그래밍 흐름 파악(주석달기)<br>
 2. 에러 페이지 작성(404.html->404.jsp)<br>
 3. 상태유지 - 쿠키 테스트 코드 작성<br>
 4. 이클립스 디버깅 사용법<br>
 5. 쿠키 코드 마이그레이션(자바->자바스크립트)remember me cookie 적용(client side)<br>
 6. remember me cookie 적용(client side)<br>
 7. jdbc 컨넥션, dbcp 컨넥션<br>
 
 <h2>2019.5.29</h2>
 1. 쿠키를 사용한 자동 로그인 기능 개발<br>
 2. dbcp connection pool 개선<br>
 3. jdni connection pool 개발<br>
 4. 기존페이지 el 적용 (${pageContext.request.contextPath})<br>
 5. userList 사용자 데이터 el, jstl 적용<br>
 6. userPagingList 사용자 데이터 el, jstl 적용<br>
 7. 테스트 주도 개발 예시(문자열 계산기)<br>
 8. jstl core set, if<br>
 9. jstl core if, forEach<br>
 
 <h2>2019.5.30</h2>
 1. 사용자 로그인 프로세스 개선(mock 데이터 -> db 데이터) <br>
 2. jstl c:chose<br>
 3. header.jsp 사용자 아이디 표시 스크립틀릿, 표현식-> jstl, el<br>
 4. userPagingList.jsp 페이지네이션 스크립틀릿, 표현식 -> jstl, el<br>
 5. c:forEach  인덱스 반복문<br>
 6. maven cycle<br>
 7. maven 배포<br>
 8. 사용자 생일 컬럼 추가<br>
 9. 사용자 상세 페이지 화면 개발<br>
 10. 사용자 상세 페이지 로직 개발<br>
 11. 사용자 페이징 리스트-> 상세페이지 이동 확인<br>
 12. 사용자 사진 조회 servlet 개발<br>
 
 <h2>2019.5.31</h2>
 1. timeTables.jsp jstl, el 전환 -> timesTablesJstl.jsp<br>
 2. 날짜 사이 간격 평균 구하기 쿼리<br>
 3. 주소 검색 api(다음주소)<br>
 4. 사용자 등록 컨트롤러 개발(userFormController)<br>
 5. 사용자 등록 쿼리, dao 개발(userDao.insertUser)<br>
 6. 사용자 등록 개발(dao, service, controller)<br>
 7. 사용자 수정 개발(dao, service, controller)<br>
 
 <h2>2019.6.3</h2>
 1. 사용자 수정 개발(dao, service, controller) 리뷰<br>
    - 사용자 생일 date 타입 포매팅<br>
      (1.신규 getter<br>
       2.select sql 수정 및 vo 필드 추가<br>
       3. fmt formateDate)<br>
2. 파일업로드<br>
3. content-disposition에서 파일명 받아오기(PartUtil)<br>
4. UUID를 통한 파일명 중복 피하기<br>
5. 파일명에서 파일 확장자 가져오기<br>
6. 년월로 업로드 폴더 구분하기<br>
7. 사용자 등록 프로필 업로드<br>
8. 사용자 수정 프로필 업로드<br>
9. noimage 처리<br>
10. 암호화 - 로그인 프로세스 해쉬 암호 적용<br>

<h2>2019.6.3</h2>
 1. 웹 프로그래밍 개념 정리 하기(학생  정리 - 중요개념 7가지 뽑아보기)<br>
 2. 암호화 - 사용자 업데이트 프로세스 해쉬 암호 적용<br>
 3. 블록 암호화 알고리즘 테스트(kisa aria)<br>
 4. 사용자 비밀번호 일괄수정(트랜잭션 개념 적용)<br>
 5. 데이터 모델링 이론<br>

<h2>2019.6.13</h2>
 1. jstl 국제화(fmt) - bundle, setBundle, message, param<br>
 2. jstl 국제화(number) - formatNumber, parseNumber<br>
 3. jstl 국제화(date) - formatDatae, parseDate<br>
 4. jstl 국제화(timezone) - timezone, setTimezone<br>
 5. jstl 국제화(select box 변경을 통한 locale 설정) <br>
 6. 커스텀 태그 만들기 - logging tag<br>
 7. 커스텀 태그 만들기 - loopLogging tag<br>
 8. 커스텀 태그 만들기 - colorLogging tag<br>
 9. 커스텀 태그 만들기 - rangers.tag<br>
 10. 커스텀 태그 만들기 - code.tag<br>
 11. Filter - 개념<br>
 12. Filter - logging filter<br>
 13. Filter - requestCount filter<br>
 
<h2>2019.6.14</h2>
 1. Filter - requestCount filter<br>
 2. Filter - loginCheck filter<br>
 3. request wrapper - DefaultParamWrapper, DefaultParamFilter<br>
 4. Listener (session life cycle, session attribute)<br>
 5. Listener (session attribute, application life cycle, session Binding)<br>
     - pageContext.request.contextPath -> cp<br>
 6. mvc 패턴 - front controller<br>

<h2>2019.6.17</h2>
 1. mvc 패턴 - front controller, RequetMapping, ViewResolver<br>
 2. mvc 패턴 - RequetMapping - db 연동(DbDao)<br>
 3. git branch (orphan)<br>
 4. db index<br>
 5. db 아키텍처, sql 실행원리<br>
