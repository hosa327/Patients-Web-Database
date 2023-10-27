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
       List<String> patientWholeName = (List<String>) request.getAttribute("patientWholeName");
       int index = Integer.parseInt((request.getAttribute("index")).toString());
       String WholeName = patientWholeName.get(index);
    %>
  <h2>Patients: <%=WholeName%></h2>

  <ul>
    <% List<String> patientDetails = (List<String>) request.getAttribute("patientDetails");
       int Index = Integer.parseInt((request.getAttribute("index")).toString());
       String message = patientDetails.get(Index);
       String[] splitMessages = message.split("\\s+" + "\\s+");
      for (String splitMessage : splitMessages)
      {
      %>
      <li><%=splitMessage%></li>
      <% } %>
      <br>
      <form method="post" action="/deletePatient.jsp">
       <%
          int id = Integer.parseInt((request.getAttribute("index")).toString());
       %>
          <input type="hidden" name="index" id="index" value="<%=id%>"/>
          <input type="submit" name="Delete" id="Delete" value="Delete"/>
      </form>

      <form method="post" action="/editPatient.jsp">
      <%
          int INDEX = Integer.parseInt((request.getAttribute("index")).toString());
          List<String> PatientWholeName = (List<String>) request.getAttribute("patientWholeName");
          List<String> PatientDetails = (List<String>) request.getAttribute("patientDetails");
          String Name = PatientWholeName.get(INDEX);
          String content = PatientDetails.get(INDEX);
      %>
          <input type="hidden" name="WholeName" id="WholeName" value="<%=Name%>"/>
          <input type="hidden" name="content" id="content" value="<%=content%>"/>
          <input type="hidden" name="index" id="index" value="<%=INDEX%>"/>
          <input type="submit" name="Edit" id="Edit" value="Edit"/>
      </form>
  </ul>
</div>
<a href="http://localhost:8080/patientList.html">Back to PatientList</a>
</body>
</html>