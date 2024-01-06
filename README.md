<div align=left><h2>🚩PMS (Project Manager System)🚩</h2></div>
Spring Boot + Mybatis

<div align=left><h2>프로젝트 소개</h2></div>
학원생들의 프로젝트 개념 및 관리 측면에서 더 나은 이해와 경험을 얻을 수 있는 사이트

<div align=left><h2>개발 기간</h2></div>
2023.10.10 - 2023.12.29

<div align=left><h2>📚 STACK</h2></div>

<div align=left><h3>📕 Environment</h3></div>

<div>
  <img src="">
</div>

<div align=left><h3>📗 Development</h3></div>
<div>
  <img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white"><img src="https://img.shields.io/badge/17-515151?style=for-the-badge">
  <img src="https://img.shields.io/badge/springboot-6DB33F?style=for-the-badge&logo=Spring Boot&logoColor=white"><img src="https://img.shields.io/badge/3.2.0-515151?style=for-the-badge">
  <img src="https://img.shields.io/badge/gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white"><img src="https://img.shields.io/badge/8.5-515151?style=for-the-badge">
  <img src="https://img.shields.io/badge/css-1572B6?style=for-the-badge&logo=css3&logoColor=white"> 
  <img src="https://img.shields.io/badge/javascript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black"> 
  <img src="https://img.shields.io/badge/jquery-0769AD?style=for-the-badge&logo=jquery&logoColor=white">
  <img src="https://img.shields.io/badge/oracle-F80000?style=for-the-badge&logo=oracle&logoColor=white">
  <img src="https://img.shields.io/badge/jsp-E6700C?style=for-the-badge&logo=jsp&logoColor=white">
  <img src="https://img.shields.io/badge/mybatis-251C1D?style=for-the-badge&logo=mybatis&logoColor=white">
  <img src="https://img.shields.io/badge/bootstrap-7952B3?style=for-the-badge&logo=bootstrap&logoColor=white">
</div>

<div align=left><h2>🔥 프로젝트 팀원 소개 및 주요 역할 분담 🔥</h2></div>

**👑팀장 황인정 (HIJ)** : 프로젝트 생성, 프로젝트 관리, 관리자 페이지, 통합검색

**🐹팀원 이진희 (LJH)** : 프로젝트용 캘린더, 알림, 프로젝트 게시판

**🐹팀원 이광현 (LKH)** : 프로젝트 작업 문서 등록/수정/삭제/리스트/조회, 휴지통, 팀원별 진척률

**🐹팀원 강준우 (KJO)** : 채팅, 관리자 페이지 

**🐹팀원 문경훈 (MKH)** : 회원가입

**🐹팀원 차예지 (CYJ)** : 전체 공지사항/이벤트/Q&A 게시판, 검색 기능, ToDoList 등록/조회

**🐹팀원 조미혜 (JMH)** : 프로젝트 메인, 프로젝트 Home, 프로젝트 게시판, 검색 기능

<div align=left><h2>💡 Naming Rule 🔥</h2></div>

**ser** : service
**ctr** : controller
**cfg** : configuration
**dmi** : domain
**rep** : respository
**dao** : dao
**aop** : aop
**han** : handler

<div align=left><h2>💻 화면 구성</h2></div>

<div align=center>
    <img width="30%" height="200px" src=""/>
    <img width="30%" height="200px" src=""/>
    <div width="30%" height="200px"></div>
</div>
<hr>

<div align=left><h2>💡 페이지 상세 </h2></div>

### 공지사항 게시판
- PMS 시스템의 모든 회원들을 대상으로 하는 전체 공지 게시물을 등록/조회
- 관리자 계정만 게시글 등록
  
### 이벤트 게시판 (댓글)
- PMS 시스템의 모든 회원들을 대상으로 하는 이벤트 관련 게시물을 등록/조회
- 회원 계정만 게시글 등록

### 자유 게시판 (댓글)
- PMS 시스템의 모든 회원들을 대상으로 하여 자유롭게 게시물을 등록/조회
- 회원 계정만 게시글 등록

### Q&A 게시판 (답글)
- PMS 시스템의 모든 회원들을 대상으로 하여 자유롭게 게시물을 등록/조회
- 회원 계정만 게시글 등록  

<div align=left><h2>💡 주요 기능 상세</h2></div>

### 게시글 추천 
- Ajax 활용
- Controller에 추천하려는 게시글 번호(pk) 전달
- 추천 Table에 게시글 번호가 존재하는지 확인 - 중복 방지 위해
- 존재하면, alert으로 '추천 중복입니다' 알림 표시
- 존재하지 않으면,
  - 추천 Table에 Insert
  - 게시판 Table에 추천 수 Update
  - 게시판 Table의 추천 수 Selete 해서 사용자가 추천 버튼 누르면, 추천 수가 alert으로 보임 

### 수정/삭제
- Session에 담겨 있는 로그인 정보 불러옴
- 게시글 번호(pk)로 작성자 ID를 갖고 와서 작성자와 로그인한 접속자 비교
- 작성자와 접속자가 일치하면 수정/삭제 버튼 노출됨
- 게시글 삭제 후 게시판 첫 페이지로 이동 

### 댓글
- 해당 글 클릭하면 하단에 리스트처럼 댓글이 달리는 구조
- 최신 순이 상단에 뜸 

### 답글
- 게시판 첫 화면에 리스트 형태로 보이지만 부모글 밑에 들여쓰기로 달리는 구조
- 

<div align=left><h2>❗ 프로젝트 회고</h2></div>

**🐹팀원 차예지** 


<div align=left><h2>❗ 프로젝트 회고</h2></div>

### ✨ Keep

### 💔 Problem
