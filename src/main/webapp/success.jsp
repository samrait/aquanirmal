<%
    if ((session.getAttribute("userName") == null) || (session.getAttribute("userName") == "")) {
%>
You are not logged in<br/>
<a href="index.jsp">Please Login</a>
<%} else {
%>
Welcome <strong><%=session.getAttribute("userName")%></strong><br>
<a href='logout.jsp'>Log out</a>
<%
    }
%>