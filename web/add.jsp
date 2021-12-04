<%--
  Created by IntelliJ IDEA.
  User: wj
  Date: 2021/11/10
  Time: 8:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
<form action="AddServlet" method="post">
    <table border="1" align="center">
        <caption>新增花卉</caption>
        <tr>
            <td>花卉名称：</td>
            <td>
                <input type="text" name="name"/>
            </td>
        </tr>
        <tr>
            <td>花卉价格：</td>
            <td>
                <input type="text" name="price"/>
            </td>
        </tr>
        <tr>
            <td>原产地：</td>
            <td>
                <input type="text" name="production"/>
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
