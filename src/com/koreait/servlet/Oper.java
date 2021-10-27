package com.koreait.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "OperServlet", value = "/Oper")
public class Oper extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        String input = request.getParameter("input");
        String[] arTemp = null;
        String opers = "+-*/";
        Calc c = null;
        PrintWriter out = response.getWriter();

        int temp = 0, result = 0, count = 0;
        for(int i = 0; i<opers.length();i++ ){
            for(int k = 0; k<input.length();k++){
                if(opers.charAt(i)==input.charAt(k)){
                    temp = i;
                    count++;
                }
            }
        }
        out.print("<p>");
        if(count == 1) {
            arTemp = input.split("\\" + opers.charAt(temp));

            try {
                c = new Calc(Integer.parseInt(arTemp[0]), Integer.parseInt(arTemp[1]));
                switch (temp) {
                    case 0:
                        result = c.add();
                        break;
                    case 1:
                        result = c.sub();
                        break;
                    case 2:
                        result = c.mul();
                        break;
                    case 3:
                        result = c.div();
                        break;
                }
                out.print("결과 : "+result);
            } catch (NumberFormatException e) {
                out.print("정수만 입력하세요");
            } catch (ArithmeticException e){
                out.print("0으로 나눌수없다");
            }
        }else if(count == 0){
            out.println("연산자를 찾을수 없다");
        }else {
            out.println("두정수의 연산만 가능");
        }
        out.print("</p>");
        out.print("<a href = 'calc.jsp'>JSP페이지로이동</a>");
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
