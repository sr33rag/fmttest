package com;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {

 public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
   processRequest(req,res);
 }

 public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
   processRequest(req,res);
 }

 private void processRequest(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
   req.getRequestDispatcher("/WEB-INF/page2.jsp").forward(req, res);
 }

}
