<h1>GST Calc</h1>
<%
    double amnt = 0;
    double gstPer = 0;
    double igst = 0;
    double sgst = 0;
    double cgst = 0;
    double total = 0;

    String btnCalc = request.getParameter("btnCalc");
    if(btnCalc!=null){
        String rd = request.getParameter("gsttype");
         gstPer = Double.parseDouble(request.getParameter("txtGstPer"));
        if(rd.equals("gst")){
             amnt = Double.parseDouble(request.getParameter("txtAmt"));
        }else{
            total = Double.parseDouble(request.getParameter("txtTotal"));
            amnt = total /(1+gstPer*0.01);
        }
        igst = amnt* gstPer * 0.01;
        total = amnt + igst;
        sgst = igst*0.5;
        cgst = igst*0.5;
    }
%>
<form method="post">
    <input type="radio" name="gsttype" value="gst"/>GST
    <input type="radio" name="gsttype" value="revgst"/>Rev.GST<br/>
    Amount<input type="number" name="txtAmt" placeholder="Enter Amount"  value="<%=amnt%>"/><br/>
    GST%<input type="number" name="txtGstPer" placeholder="Enter GST %" value="<%=gstPer%>"/><br/>
    IGST<input type="number" name="txtiGst"  value="<%=igst%>" readonly/><br/>
    SGST<input type="number" name="txtsGst"  value="<%=sgst%>" readonly/><br/>
    CGST<input type="number" name="txtcGst"  value="<%=cgst%>" readonly/><br/>
    Total<input type="number" name="txtTotal"  value="<%=total%>"/><br/>

    <input type="submit" name="btnCalc" value="Calculate"/>
</form>
