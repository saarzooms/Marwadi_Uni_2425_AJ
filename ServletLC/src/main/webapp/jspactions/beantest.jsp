<jsp:useBean id="mybeanobj" class="com.allysoftsolutions.usebeantest.MyBean" />
<jsp:getProperty name="mybeanobj" property="msg"/><br/>
<jsp:setProperty name="mybeanobj" property="msg" value="Hi there"/>
<jsp:getProperty name="mybeanobj" property="msg"/>