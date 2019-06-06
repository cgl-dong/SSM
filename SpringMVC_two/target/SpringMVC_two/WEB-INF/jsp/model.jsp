<%--
  Created by IntelliJ IDEA.
  User: 车国亮
  Date: 2019/5/12
  Time: 0:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>modelDemo</title>
</head>
<body>
    <form>
        姓名：<input type="text" value="${user.username}">
        密码：<input type="text" value="${user.password}">
        年龄：<input type="text" value="${user.age}">
        国家：<input type="text" value="${user.aderess.country}">
        城市：<input type="text" value="${user.aderess.city}">
    </form>
</body>
</html>
