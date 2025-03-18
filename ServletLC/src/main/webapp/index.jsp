<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Date"%>
<html>
<body>
<%=new Date()%>
<h1><%=application.getAttribute("app_name")%></h1>
<%=session.getAttribute("user") %>
<%= pageContext.getAttribute("app_name",pageContext.PAGE_SCOPE)%><br/>
<%=pageContext.getAttribute("app_name",pageContext.APPLICATION_SCOPE)%><br/>
<%=pageContext.getAttribute("app_name",pageContext.SESSION_SCOPE)%><br/>
<h2>Hello World!</h2>
</body>
</html>
