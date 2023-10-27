/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.45
 * Generated at: 2023-03-29 12:44:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;

public final class searchResult_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <title>Patient Data App</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"main\">\n");
      out.write("  <h1>Result</h1>\n");
      out.write("\n");
      out.write("  <a href=\"http://localhost:8080/search.html\">Back to Search Page</a>\n");
      out.write("  <form action=\"patientDetails.html\" method=\"get\">\n");
      out.write("  ");

    List<String> patients = (List<String>) request.getAttribute("ResultName");
    List<Integer> ResultIndex = (List<Integer>) request.getAttribute("ResultIndexName");
    Integer l = ResultIndex.size();
  
      out.write("\n");
      out.write("    <p>By Name: there is ");
      out.print(l);
      out.write(" results, clicking number to view details</p>\n");
      out.write("  ");

    if(l != 0){
        for (int i = 0; i < patients.size(); i++){
            String patient = patients.get(i);
            Integer index = ResultIndex.get(i);
  
      out.write("\n");
      out.write("    <li><text>index:</text><input type=\"submit\" name=\"index\" value=\"");
      out.print(index);
      out.write("\"/>  <text>");
      out.print(patient);
      out.write("</text>\n");
      out.write("    </li>\n");
      out.write("    <br>\n");
      out.write("  ");
    }
    }
    else{
    out.print("No Result Found");
    }
  
      out.write("\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<a href=\"http://localhost:8080/search.html\">Back to Search Page</a>\n");
      out.write("<form action=\"patientDetails.html\" method=\"get\">\n");
      out.write("  ");

    List<String> patientsID = (List<String>) request.getAttribute("ResultID");
    List<Integer> ResultIndexID = (List<Integer>) request.getAttribute("ResultIndexID");
    Integer lID = ResultIndexID.size();
  
      out.write("\n");
      out.write("    <p>By ID: there is ");
      out.print(lID);
      out.write(" results, clicking number to view details</p>\n");
      out.write("  ");

    if(lID != 0){
        for (int i = 0; i < patientsID.size(); i++){
            String patientID = patientsID.get(i);
            Integer indexID = ResultIndexID.get(i);
  
      out.write("\n");
      out.write("    <li><text>index:</text><input type=\"submit\" name=\"index\" value=\"");
      out.print(indexID);
      out.write("\"/>  <text>");
      out.print(patientID);
      out.write("</text>\n");
      out.write("    </li>\n");
      out.write("    <br>\n");
      out.write("  ");
    }
    }
    else{
    out.print("No Result Found");
    }
  
      out.write("\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<a href=\"http://localhost:8080/search.html\">Back to Search Page</a>\n");
      out.write("<form action=\"patientDetails.html\" method=\"get\">\n");
      out.write("  ");

    List<String> patientsSsn = (List<String>) request.getAttribute("ResultSsn");
    List<Integer> ResultIndexSsn = (List<Integer>) request.getAttribute("ResultIndexSsn");
    Integer lSsn = ResultIndexSsn.size();
  
      out.write("\n");
      out.write("    <p>By SSN: there is ");
      out.print(lSsn);
      out.write(" results, clicking number to view details</p>\n");
      out.write("  ");

    if(lSsn != 0){
        for (int i = 0; i < patientsSsn.size(); i++){
            String patientSsn = patientsSsn.get(i);
            Integer indexSsn = ResultIndexSsn.get(i);
  
      out.write("\n");
      out.write("    <li><text>index:</text><input type=\"submit\" name=\"index\" value=\"");
      out.print(indexSsn);
      out.write("\"/>  <text>");
      out.print(patientSsn);
      out.write("</text>\n");
      out.write("    </li>\n");
      out.write("    <br>\n");
      out.write("  ");
    }
    }
    else{
    out.print("No Result Found");
    }
  
      out.write("\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<a href=\"http://localhost:8080/search.html\">Back to Search Page</a>\n");
      out.write("<form action=\"patientDetails.html\" method=\"get\">\n");
      out.write("  ");

    List<String> patientsPassport = (List<String>) request.getAttribute("ResultPassport");
    List<Integer> ResultIndexPassport = (List<Integer>) request.getAttribute("ResultIndexPassport");
    Integer lPassport = ResultIndexPassport.size();
  
      out.write("\n");
      out.write("    <p>By Passport: there is ");
      out.print(lPassport);
      out.write(" results, clicking number to view details</p>\n");
      out.write("  ");

    if(lPassport != 0){
        for (int i = 0; i < patientsPassport.size(); i++){
            String patientPassport = patientsPassport.get(i);
            Integer indexPassport = ResultIndexPassport.get(i);
  
      out.write("\n");
      out.write("    <li><text>index:</text><input type=\"submit\" name=\"index\" value=\"");
      out.print(indexPassport);
      out.write("\"/>  <text>");
      out.print(patientPassport);
      out.write("</text>\n");
      out.write("    </li>\n");
      out.write("    <br>\n");
      out.write("  ");
    }
    }
    else{
    out.print("No Result Found");
    }
  
      out.write("\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<a href=\"http://localhost:8080/search.html\">Back to Search Page</a>\n");
      out.write("<form action=\"patientDetails.html\" method=\"get\">\n");
      out.write("  ");

    List<String> patientsDriver = (List<String>) request.getAttribute("ResultDriver");
    List<Integer> ResultIndexDriver = (List<Integer>) request.getAttribute("ResultIndexDriver");
    Integer lDriver = ResultIndexDriver.size();
  
      out.write("\n");
      out.write("    <p>By DriverLicense: there is ");
      out.print(lDriver);
      out.write(" results, clicking number to view details</p>\n");
      out.write("  ");

    if(lDriver != 0){
        for (int i = 0; i < patientsDriver.size(); i++){
            String patientDriver = patientsDriver.get(i);
            Integer indexDriver = ResultIndexDriver.get(i);
  
      out.write("\n");
      out.write("    <li><text>index:</text><input type=\"submit\" name=\"index\" value=\"");
      out.print(indexDriver);
      out.write("\"/>  <text>");
      out.print(patientDriver);
      out.write("</text>\n");
      out.write("    </li>\n");
      out.write("    <br>\n");
      out.write("  ");
    }
    }
    else{
    out.print("No Result Found");
    }
  
      out.write("\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("  <a href=\"http://localhost:8080/search.html\">Back to Search Page</a>\n");
      out.write("  </ul>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
