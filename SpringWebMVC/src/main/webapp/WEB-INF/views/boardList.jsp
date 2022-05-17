<%@page import="kr.smhrd.dao.BoardVO" %>
<%@page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% List<BoardVO> list = (List<BoardVO>)request.getAttribute("list"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My_Practice_Board</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<h1>Spring MVC Board</h1>
<div class="container mt-3">
  <h2>Normal board</h2>
  <p>The first My_Practice_Board was maden by spring framework</p>            
  <table class="table table-striped">
    <thead>
      <tr>
        <th>번호</th>
        <th>제목</th>
        <th>작성자</th>
        <th>날짜</th>
        <th>조회수</th>
      </tr>
    </thead>
	<tbody>
	  <c:forEach var="vo" items="${requestScope.list }">
        <tr>
          <td>${vo.idx }</td>
          <td>${vo.title}</td>
          <td>${vo.writer}</td>
          <td>${vo.revisingDate}</td>
          <td>${vo.sawCount}</td>
        </tr>
     
      </c:forEach>
    </tbody>
  </table>
</div>

</body>
</html>