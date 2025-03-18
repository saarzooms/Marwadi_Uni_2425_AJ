<h1><%=application.getAttribute("app_name")%></h1>
<%=application.getAttribute("name") %>
<% pageContext.setAttribute("app_name","MYVAL",pageContext.PAGE_SCOPE);%>
<% pageContext.setAttribute("app_name","session val",pageContext.SESSION_SCOPE);%>
<% pageContext.setAttribute("app_name","app name",pageContext.APPLICATION_SCOPE);%>
<%= pageContext.getAttribute("app_name",pageContext.PAGE_SCOPE)%><br/>
<%=pageContext.getAttribute("app_name",pageContext.APPLICATION_SCOPE)%><br/>
<%=pageContext.getAttribute("app_name",pageContext.SESSION_SCOPE)%><br/>