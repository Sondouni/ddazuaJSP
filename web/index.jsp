<%--
  Created by IntelliJ IDEA.
  User: Sondouni
  Date: 2021-10-26
  Time: 오후 10:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
  <head>
    <title>JSP페이지</title>
  </head>
  <body>
      <h1>JSP로 만든 페이지</h1>
      <form action="Hello" method="post">
        <p>서블릿으로 이동</p>
        <button>이동</button>
      </form>
      <footer>
          ${5+9}
      </footer>
  </body>
</html>
