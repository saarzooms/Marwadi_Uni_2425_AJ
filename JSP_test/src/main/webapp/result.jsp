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

   }else{
   out.println("please enter data from input file");}
%>