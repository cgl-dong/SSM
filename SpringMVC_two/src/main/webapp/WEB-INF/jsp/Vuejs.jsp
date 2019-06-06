<%--
  Created by IntelliJ IDEA.
  User: 车国亮
  Date: 2019/5/14
  Time: 9:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <script src="https://cdn.staticfile.org/vue/2.2.2/vue.min.js"></script>
    <style>
        .box{
            background-color: green;
            width: 80%;
            height: 300px;
            padding: 10px;
            border: yellow 10px solid;
        }
    </style>
</head>
<body>
<div class="box">
    <form action="/MVC/mvc4/hello" method="post">
        <input type="image" src="http://images2015.cnblogs.com/blog/740839/201612/740839-20161224090242776-1552581192.jpg" width="200px"
               height="200px">
        <input type="text" name="name" value="hello">
        <button type="submit">提交</button>
    </form>

    <form action="/MVC/mvc4/Vue" method="post">
        <label>Address</label>
        <input type="text" value="${user.adderss.country}">
        <input type="text" value="${user.adderss.city}">
        <button type="submit">提交</button>
    </form>
</div>

</body>
</html>
