<%--
  Created by IntelliJ IDEA.
  User: wj
  Date: 2021/11/9
  Time: 17:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        tr{
            text-align: center;
        }
    </style>
</head>
<body>
<center><h2 style="color: red;">花卉管理系统</h2></center>
<table border="1" align="center">
    <tr>
        <th>编号</th>
        <th>名字</th>
        <th>价格</th>
        <th>产地</th>
        <th colspan="2">操作</th>
    </tr>
    <c:forEach items="${flowers}" var="flower">
        <tr>
            <td>${flower.id}</td>
            <td>${flower.name}</td>
            <td>${flower.price}</td>
            <td>${flower.production}</td>
            <td>
                <a href="DelServlet?id=${flower.id}" onclick="alert('删除该条数据！')">删除</a>
            </td>
            <td>
                <a href="ShowByIdServlet?id=${flower.id}">修改</a>
            </td>
        </tr>
    </c:forEach>
</table>
<center><a href="add.jsp">新增花卉</a></center>
</body>
</html>
