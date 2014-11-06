package com;

import java.io.InputStream;
import java.io.IOException;

import java.util.ResourceBundle;
import java.util.MissingResourceException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFilter implements Filter {

 private FilterConfig config=null;
 private ResourceBundle bundle=null;

 public void init(FilterConfig _config) {
   this.config=_config;
 }

 public void doFilter(ServletRequest sReq, ServletResponse sRes, FilterChain chain) throws IOException, ServletException {
    HttpServletRequest req = (HttpServletRequest) sReq;
    HttpServletResponse res = (HttpServletResponse) sRes;
    bundle=ResourceBundle.getBundle("MessageBundle");
    req.setAttribute("messages",bundle);
    chain.doFilter(req,res);
 }

 public void destroy() 
 {}

}
