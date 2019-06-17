<h1> JSP프로젝트 설명 </h1>

<h2>2019.5.20</h2>
 1. 개발환경 구축
 2. 서버프로그램 구현
  - 이클립스 개발환경 설정(주석 템플릿)
 3. BasicServlet클래스 생성, servlet mapping 등록(web xml)
 4. NowDateServlet클래스 생성, servlet mapping등록(web.xml)
    response content-type
 5. servlet life cycle
    timesServlet
 6. request parameter
    timesServlet request Parameter적용
 
 <h2>2019.5.21</h2>
 1. maven프로젝트, 기본 서블릿 생성
 2. logback설정, 사용방법
 3. jsp기본 개념(page지시어, 스크립틀릿, 표현식, 주석)
 4. jsp times Tables 실습
 5. jsp factorial실습
 6. jsp 내장객체(HttpServletRequest)
 
 <h2>2019.5.22</h2>
 1. timesTables.jsp 파라미터 적용 코드 리뷰
 2. request parameter 메소드 확인
 3. login.jsp loginProcess.jsp
 4. bootstrap login화면 적용
 5. redirect ( response sendRedirect)
 6. dispatch (requestDispatcher.forward(request, response)
 7. login프로세스 (redirect, dispatch 적용)
 6. main.jsp bootstrap적용
 7. jsp 실행원리 (서블릿 변환과정)
    url mapping 처리
    out, application
    application 객체를 통한 어플리케이션 내 자원 접근하기 실습
    
 <h2>2019.5.23</h2>
 1. jsp scope객체, 속성
 2. 두개의 숫자를 파라미터로 받아 합 계산하여 scope에 저장, 출력 (학생실습)
 3. 사용자 리스트 메뉴 실습
 4. 로그인 정보 session 저장 실습(null 처리)
 5. 로그아웃 처리 실습
 6. 세션정보 존재시 로그인 화면을 통한 로그인 방지 처리(메인화면 이동)"
 7. 페이지 모듈화(header, left, commonLib)
 
 <h2>2019.5.24</h2>
 1. 로그인 프로세스 복습(학생 실습)
    ( scope-세션 개념 포함)
 2. mybatis 설정(maven respository)
 3. userDao userList 수정 개발
    exerd 설치, users테이블 설계"
 4. userDao getUser 코드, 테스트 코드 개발
 5. junit 필요성, 설정
 6. UserService userList, getUser 코드, 테스트 코드 작성
 7. user 데이터 대량 생성하기
 8. userService, userDao getUser 코드 작성
 9. userService, userDao getUser 테스트 코드 작성
 10. 사용자 페이지 리스트 조회 쿼리 작성"
 
 <h2>2019.5.27</h2>
 1. 사용자 리스트 조회 mvc 복습
 2. 사용자 페이지 리스트 조회 쿼리 작성
 3. 사용자 페이지 리스트 조회 로직, 테스트 코드 작성(service, dao)"
 4. 사용자 페이지 리스트 컨트롤러 로직 작성(테스트 코드 X)
 5. page, pageSize 파라미터가 없을경우 default value 처리 (page = 1, pageSize = 10)
 6. pagination  처리 (usersCnt -> paginationSize 계산)
 7. pagination  처리 로직에 따른 userService 로직 개선"
 8. pagination  처리 (usersCnt -> paginationSize 계산)
 9. pagination  처리 (pagination 화면 출력, li active class 추가)
 10. pagination  처리 (pagination 화면 출력, li active class 추가, 이전 페이지, 다음 페이지 가기 버튼)
 
 <h2>2019.5.28</h2>
 1. 웹 프로그래밍 흐름 파악(주석달기)
 2. 에러 페이지 작성(404.html->404.jsp)
 3. 상태유지 - 쿠키 테스트 코드 작성
 4. 이클립스 디버깅 사용법
 5. 쿠키 코드 마이그레이션(자바->자바스크립트)remember me cookie 적용(client side)"
 6. remember me cookie 적용(client side)
 7. jdbc 컨넥션, dbcp 컨넥션
 
 <h2>2019.5.29</h2>
 1. 쿠키를 사용한 자동 로그인 기능 개발
 2. dbcp connection pool 개선
 3. jdni connection pool 개발"
 4. 기존페이지 el 적용 (${pageContext.request.contextPath})
 5. userList 사용자 데이터 el, jstl 적용
 6. userPagingList 사용자 데이터 el, jstl 적용
 7. 테스트 주도 개발 예시(문자열 계산기)
 8. jstl core set, if
 9. jstl core if, forEach
 
 <h2>2019.5.30</h2>
 1. 사용자 로그인 프로세스 개선(mock 데이터 -> db 데이터) 
 2. jstl c:chose
 3. header.jsp 사용자 아이디 표시 스크립틀릿, 표현식-> jstl, el
 4. userPagingList.jsp 페이지네이션 스크립틀릿, 표현식 -> jstl, el
 5. c:forEach  인덱스 반복문
 6. maven cycle
 7. maven 배포
 8. 사용자 생일 컬럼 추가
 9. 사용자 상세 페이지 화면 개발
 10. 사용자 상세 페이지 로직 개발
 11. 사용자 페이징 리스트-> 상세페이지 이동 확인
 12. 사용자 사진 조회 servlet 개발
 
 <h2>2019.5.31</h2>
 1. timeTables.jsp jstl, el 전환 -> timesTablesJstl.jsp
 2. 날짜 사이 간격 평균 구하기 쿼리
 3. 주소 검색 api(다음주소)
 4. 사용자 등록 컨트롤러 개발(userFormController)
 5. 사용자 등록 쿼리, dao 개발(userDao.insertUser)
 6. 사용자 등록 개발(dao, service, controller)
 7. 사용자 수정 개발(dao, service, controller)
 
 <h2>2019.6.3</h2>
 1. 사용자 수정 개발(dao, service, controller) 리뷰
    - 사용자 생일 date 타입 포매팅
      (1.신규 getter
       2.select sql 수정 및 vo 필드 추가
       3. fmt formateDate)
2. 파일업로드
3. content-disposition에서 파일명 받아오기(PartUtil)
4. UUID를 통한 파일명 중복 피하기
5. 파일명에서 파일 확장자 가져오기
6. 년월로 업로드 폴더 구분하기
7. 사용자 등록 프로필 업로드
8. 사용자 수정 프로필 업로드
9. noimage 처리
10. 암호화 - 로그인 프로세스 해쉬 암호 적용

<h2>2019.6.3<h2>
 1. 웹 프로그래밍 개념 정리 하기(학생  정리 - 중요개념 7가지 뽑아보기)
 2. 암호화 - 사용자 업데이트 프로세스 해쉬 암호 적용
 3. 블록 암호화 알고리즘 테스트(kisa aria)
 4. 사용자 비밀번호 일괄수정(트랜잭션 개념 적용)
 5. 데이터 모델링 이론

<h2>2019.6.13</h2>
 1. jstl 국제화(fmt) - bundle, setBundle, message, param
 2. jstl 국제화(number) - formatNumber, parseNumber
 3. jstl 국제화(date) - formatDatae, parseDate
 4. jstl 국제화(timezone) - timezone, setTimezone
 5. jstl 국제화(select box 변경을 통한 locale 설정) 
 6. 커스텀 태그 만들기 - logging tag
 7. 커스텀 태그 만들기 - loopLogging tag
 8. 커스텀 태그 만들기 - colorLogging tag
 9. 커스텀 태그 만들기 - rangers.tag
 10. 커스텀 태그 만들기 - code.tag
 11. Filter - 개념
 12. Filter - logging filter
 13. Filter - requestCount filter
 
<h2>2019.6.14</h2>
 1. Filter - requestCount filter
 2. Filter - loginCheck filter
 3. request wrapper - DefaultParamWrapper, DefaultParamFilter
 4. Listener (session life cycle, session attribute)
 5. Listener (session attribute, application life cycle, session Binding)
     - pageContext.request.contextPath -> cp
 6. mvc 패턴 - front controller

<h2>2019.6.17</h2>
 1. mvc 패턴 - front controller, RequetMapping, ViewResolver
 2. mvc 패턴 - RequetMapping - db 연동(DbDao)
 3. git branch (orphan)
 4. db index
 5. db 아키텍처, sql 실행원리
