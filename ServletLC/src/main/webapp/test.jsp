<%
    int per = 40;


      switch(per){
        case %>${gt 75}<%: out.print("dist"); break;
        case 60: out.print("first"); break;
        case 50: out.print("second"); break;
        case 35: out.print("pass"); break;
        default:out.print("fail");
      }

%>