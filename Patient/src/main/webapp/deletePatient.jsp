<%@ page import="java.util.List" %>
<%@ page import="java.lang.String" %>
<%@ page import = "java.util.StringTokenizer" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Patient Data App</title>
</head>
  <body>
  <h2>Delete Patient</h2>
  <%
    String index = request.getParameter("index");
    response.sendRedirect(request.getContextPath() + "/DeletePatient?id="+index);
  %>
  <p><%=index%></p>
  </body>
<a href="http://localhost:8080">Back to HomePage</a>
</html>
