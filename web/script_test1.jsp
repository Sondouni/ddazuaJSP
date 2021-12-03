<%--
  Created by IntelliJ IDEA.
  User: Sondouni
  Date: 2021-10-27
  Time: 오후 6:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Scripting Tag</title>
</head>
<body>
    <%! int count = 3;%>
    <% count =4; %>
    <%= count%>
    <script>
        const superman ={
            name:'clack',
            age:30,
        }
        superman.hiarColor = 'black';
        superman['hobby']='football';
        console.log(superman)

        delete superman.name;
    </script>
</body>
</html>
