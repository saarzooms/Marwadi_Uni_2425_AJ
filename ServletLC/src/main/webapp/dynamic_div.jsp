<style>
    .mydiv{
    display:inline-block;
    font-size:50;
    border:2px dotted black;
    height:100px;
    width:100px;
    margin:10px;
    border-radius:50px;
    padding:25px;
    }
</style>
<h1><%=application.getAttribute("app_name")%></h1>
<%=session.getAttribute("user") %>
<form>
<input type="number" name="txtNum" placeholder="Enter any number"/>
<input type="submit" name="btnSubmit" value="Generate"/>
</form>
<%
application.setAttribute("name","Arzoo");
    if(request.getParameter("btnSubmit")!=null){
        int num = Integer.parseInt(request.getParameter("txtNum"));
        for(int i =0;i<num;i++){
        for(int j =0;j<num;j++){
        String color = "#"+(int)java.lang.Math.floor(java.lang.Math.random() * 999999);
        System.out.println(color);
            out.print("<div class='mydiv' style='background-color:"+color+";'>"+(j+1)+"</div>");
        }
        out.print("<br/>");
        }
    }
%>