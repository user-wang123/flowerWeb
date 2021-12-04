<%--
  Created by IntelliJ IDEA.
  User: wj
  Date: 2021/11/10
  Time: 9:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        /* 标签选择器 */
        tr{
            text-align: center;
        }
    </style>
</head>
<body>
<form action="UpdServlet" method="post">
    <table border="1" align="center">
        <caption style="color: red;">待修改的信息</caption>
        <tr>
            <th>名称：</th>
            <td>
                <!-- 数据回显 -->
                <input type="hidden" name="id" value="${flower.id}"/>
                <input type="text" name="name" value="${flower.name}"/>
            </td>
        </tr>
        <tr>
            <th>价格：</th>
            <td>
                <input type="text" name="price" value="${flower.price}"/>
            </td>
        </tr>
        <tr>
            <th>产地：</th>
            <td>
                <input type="text" name="production" value="${flower.production}"/>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="提交"/>
                <input type="reset" value="重置"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
