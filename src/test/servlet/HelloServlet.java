package test.servlet;

import javax.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//1.Http ctrl+study import하기
//2.@Webservlet ctrl+space
@WebServlet("/hello")
public class HelloServlet extends HttpServlet{
//3.service ctrl+space
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
PrintWriter pw=resp.getWriter();
pw.println("lst's play!");
pw.close();
}

}
	

