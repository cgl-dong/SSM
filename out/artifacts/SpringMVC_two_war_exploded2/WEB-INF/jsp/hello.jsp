<%--
  Created by IntelliJ IDEA.
  User: 车国亮
  Date: 2019/5/7
  Time: 10:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String hello= (String) request.getAttribute("hello");
    out.print(hello);
%>
</body>
</html>
