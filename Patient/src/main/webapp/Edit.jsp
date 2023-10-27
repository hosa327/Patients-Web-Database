<%@ page import="java.util.List" %>
<%@ page import="java.lang.String" %>
<%@ page import = "java.util.StringTokenizer" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Patient Data App</title>
</head>
  <body>
  <h2>Edit Patient</h2>
  <%
    String content = "";
    for(int i=1; i<18; i++)
    {
    String parameter = Integer.toString(i);
    String line = request.getParameter(parameter) + "  ";
    content = content + line;
    }
    String index = request.getParameter("index");
    response.sendRedirect(request.getContextPath() + "/EditPatientDetails?id="+ index + "&content=" + content);
  %>
  </body>
<a href="http://localhost:8080">Back to HomePage</a>
</html>
