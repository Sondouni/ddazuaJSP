<%--
  Created by IntelliJ IDEA.
  User: Sondouni
  Date: 2021-10-27
  Time: 오전 12:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>계산기 - JSP페이지</title>
</head>
<body>
    <h1>JSP로 만든 페이지</h1>
    <form action="Oper" method="post">
        <p>수식을 입력하세요(두정수의 사칙연산)</p>
        <input type="text" name = "input">
        <button>확인</button>
    </form>
</body>
</html>
