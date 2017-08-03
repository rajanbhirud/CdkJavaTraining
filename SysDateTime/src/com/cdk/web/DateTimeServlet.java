package com.cdk.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;


public class DateTimeServlet extends javax.servlet.http.HttpServlet {

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter responseWriter = response.getWriter();
        Date date = new Date();
        responseWriter.write("System Time  : " + date.getTime());
        responseWriter.write("System Date  : " + date.getDay());
        double random = Math.random();
        responseWriter.write("Random Number : " + random);
    }
}
