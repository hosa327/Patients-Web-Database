<%@ page import="java.util.List" %>
<%@ page import="java.lang.String" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
  <jsp:include page="/meta.jsp"/>
  <title>Patient Data App</title>
</head>
<body>
<jsp:include page="/header.jsp"/>
<div class="main">
    <%
      String WholeName = request.getParameter("WholeName");
      Integer index = Integer.parseInt(request.getParameter("index"));
    %>
  <h2>Patients: <%=WholeName%></h2>
  <ul>
    <form action="Edit.jsp" method="post">
    <%
      int i = 0;
      String message = request.getParameter("content");
      String[] splitMessages = message.split("\\s+" + "\\s+");
      for (String splitMessage : splitMessages)
      { i += 1;
      %>
      <li><input type="text" name="<%=i%>" id="<%=i%>" value="<%=splitMessage%>"> </li>
      <% } %>
      <input type="hidden" name="index" id="index" value="<%=index%>">
      <input type="submit" value="save">
    </form>
  </ul>
</div>
<a href="http://localhost:8080/patientList.html">Back to PatientList</a>
</body>
</html>