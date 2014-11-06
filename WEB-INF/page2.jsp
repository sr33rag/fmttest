<%@page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/function" prefix="fn"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/format" prefix="fmt"%>
<fmt:setBundle basename="MessageBundle"/>
<html>
<head>
 <title><fmt:message key="homepage.title"/></title>
</head>
<body>
 <h2 color="blue"><fmt:message key="homepage.greeting"/></h2>
</body>
</html>

