﻿<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>게시물 목록</title>
    <script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
    <h1>게시물 목록</h1>
    <a href="/post/write">글 작성하기</a>

    <table border="1">
        <tr>
            <th>번호</th>
            <th>제목</th>
            <th>작성자</th>
            <th>작성일시</th>
        </tr>

    <c:forEach var="post" items="${posts}">
        <tr>
            <td>${post.postId}</td>
            <td>${post.postTitle}</td>
            <td>${post.postWriter}</td>
            <td>${post.createAt}</td>
        </tr>
    </c:forEach>
    </table>

    <script src="${pageContext.request.contextPath}/js/script.js"></script>
</body>
</html>
