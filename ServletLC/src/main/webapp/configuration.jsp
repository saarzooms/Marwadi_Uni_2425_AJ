<form>
<input type="text" name="txtName" placeholder="Enter any name"/>
<input type="submit" name="btnSubmit" value="Generate"/>
</form>
<%
 if(request.getParameter("btnSubmit")!=null){
        String name = request.getParameter("txtName");
        application.setAttribute("app_name",name);
        }
%>