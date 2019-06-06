<%--
  Created by IntelliJ IDEA.
  User: 车国亮
  Date: 2019/5/13
  Time: 23:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="true" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<form action="/MVC/mvc3/pojo" method="post">

    用户名:<input type="text" name="username" value="Marry"></br>

    性别:<input type="text" name="sex" value="女"></br>


    <input type="submit" value="提交">

</form>
<% String hello=null;
  out.println(hello);
%>

</body>
</html>
