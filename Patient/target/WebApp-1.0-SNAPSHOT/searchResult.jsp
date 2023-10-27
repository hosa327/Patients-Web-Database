<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
  <title>Patient Data App</title>
</head>
<body>
<div class="main">
  <h1>Result</h1>

  <a href="http://localhost:8080/search.html">Back to Search Page</a>
  <form action="patientDetails.html" method="get">
  <%
    List<String> patients = (List<String>) request.getAttribute("ResultName");
    List<Integer> ResultIndex = (List<Integer>) request.getAttribute("ResultIndexName");
    Integer l = ResultIndex.size();
  %>
    <p>By Name: there is <%=l%> results, clicking number to view details</p>
  <%
    if(l != 0){
        for (int i = 0; i < patients.size(); i++){
            String patient = patients.get(i);
            Integer index = ResultIndex.get(i);
  %>
    <li><text>index:</text><input type="submit" name="index" value="<%=index%>"/>  <text><%=patient%></text>
    </li>
    <br>
  <%    }
    }
    else{
    out.print("No Result Found");
    }
  %>
    </form>



<a href="http://localhost:8080/search.html">Back to Search Page</a>
<form action="patientDetails.html" method="get">
  <%
    List<String> patientsID = (List<String>) request.getAttribute("ResultID");
    List<Integer> ResultIndexID = (List<Integer>) request.getAttribute("ResultIndexID");
    Integer lID = ResultIndexID.size();
  %>
    <p>By ID: there is <%=lID%> results, clicking number to view details</p>
  <%
    if(lID != 0){
        for (int i = 0; i < patientsID.size(); i++){
            String patientID = patientsID.get(i);
            Integer indexID = ResultIndexID.get(i);
  %>
    <li><text>index:</text><input type="submit" name="index" value="<%=indexID%>"/>  <text><%=patientID%></text>
    </li>
    <br>
  <%    }
    }
    else{
    out.print("No Result Found");
    }
  %>
    </form>



<a href="http://localhost:8080/search.html">Back to Search Page</a>
<form action="patientDetails.html" method="get">
  <%
    List<String> patientsSsn = (List<String>) request.getAttribute("ResultSsn");
    List<Integer> ResultIndexSsn = (List<Integer>) request.getAttribute("ResultIndexSsn");
    Integer lSsn = ResultIndexSsn.size();
  %>
    <p>By SSN: there is <%=lSsn%> results, clicking number to view details</p>
  <%
    if(lSsn != 0){
        for (int i = 0; i < patientsSsn.size(); i++){
            String patientSsn = patientsSsn.get(i);
            Integer indexSsn = ResultIndexSsn.get(i);
  %>
    <li><text>index:</text><input type="submit" name="index" value="<%=indexSsn%>"/>  <text><%=patientSsn%></text>
    </li>
    <br>
  <%    }
    }
    else{
    out.print("No Result Found");
    }
  %>
    </form>



<a href="http://localhost:8080/search.html">Back to Search Page</a>
<form action="patientDetails.html" method="get">
  <%
    List<String> patientsPassport = (List<String>) request.getAttribute("ResultPassport");
    List<Integer> ResultIndexPassport = (List<Integer>) request.getAttribute("ResultIndexPassport");
    Integer lPassport = ResultIndexPassport.size();
  %>
    <p>By Passport: there is <%=lPassport%> results, clicking number to view details</p>
  <%
    if(lPassport != 0){
        for (int i = 0; i < patientsPassport.size(); i++){
            String patientPassport = patientsPassport.get(i);
            Integer indexPassport = ResultIndexPassport.get(i);
  %>
    <li><text>index:</text><input type="submit" name="index" value="<%=indexPassport%>"/>  <text><%=patientPassport%></text>
    </li>
    <br>
  <%    }
    }
    else{
    out.print("No Result Found");
    }
  %>
    </form>



<a href="http://localhost:8080/search.html">Back to Search Page</a>
<form action="patientDetails.html" method="get">
  <%
    List<String> patientsDriver = (List<String>) request.getAttribute("ResultDriver");
    List<Integer> ResultIndexDriver = (List<Integer>) request.getAttribute("ResultIndexDriver");
    Integer lDriver = ResultIndexDriver.size();
  %>
    <p>By DriverLicense: there is <%=lDriver%> results, clicking number to view details</p>
  <%
    if(lDriver != 0){
        for (int i = 0; i < patientsDriver.size(); i++){
            String patientDriver = patientsDriver.get(i);
            Integer indexDriver = ResultIndexDriver.get(i);
  %>
    <li><text>index:</text><input type="submit" name="index" value="<%=indexDriver%>"/>  <text><%=patientDriver%></text>
    </li>
    <br>
  <%    }
    }
    else{
    out.print("No Result Found");
    }
  %>
    </form>


  <a href="http://localhost:8080/search.html">Back to Search Page</a>
  </ul>
</div>
</body>
</html>