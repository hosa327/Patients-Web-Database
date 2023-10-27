<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
  <jsp:include page="/meta.jsp"/>
  <title>Patient Data App</title>
</head>
<body>
<jsp:include page="/header.jsp"/>
<div class="main">
  <h2>Patients:</h2>
  <p>Click the number to view more details</p>
  <ul>
        <form action="patientDetails.html" method="get">
        <%
          List<String> patients = (List<String>) request.getAttribute("patientNames");
          for (int i = 0; i < patients.size(); i++)
          {
            String patient = patients.get(i);
        %>
        <li><input type="submit" name="index" value="<%=i%>"/><text><%=patient%></text>
        </li>
        <br>
        <% } %>
        </form>
  </ul>
</div>
<a href="http://localhost:8080">Back to HomePage</a>
</body>
</html>
