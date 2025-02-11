<html>
<body>
<form method="post">
<input type="number" name="txtFirstNum" required/>
<input type="number" name="txtSecondNum" required/>
<select name="operation">
    <option value="+">+</option>
    <option value="-">-</option>
    <option value="*">*</option>
    <option value="/">/</option>
    <option value="%">%</option>
</select>
<input type="submit" value="Calc" name="btnSubmit"/>
</form>
<%
String btn = request.getParameter("btnSubmit");
if(btn!=null){
   int numF =  Integer.parseInt(request.getParameter("txtFirstNum").equals("")?"0":request.getParameter("txtFirstNum"));
   int numS =  Integer.parseInt(request.getParameter("txtSecondNum").equals("")?"0":request.getParameter("txtSecondNum"));
   String opt =  request.getParameter("operation");
   switch(opt){
    case "-":out.println(numF+"-"+numS+"="+(numF-numS));break;
    case "*":out.println(numF+"*"+numS+"="+(numF*numS));break;
    case "+":out.println(numF+"+"+numS+"="+(numF+numS));break;
    case "/":if(numS==0)out.println("Division with zero is not available ");else{out.println(numF+"/"+numS+"="+(numF/numS));}break;
    case "%":out.println(numF+"%"+numS+"="+(numF%numS));break;
    default:out.println("Invalid choice");break;
   }

   }
%>
</body>
</html>
