package uk.ac.ucl.servlets;

import uk.ac.ucl.model.Model;
import uk.ac.ucl.model.ModelFactory;
//import uk.ac.ucl.model.PatientInfo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

import static java.lang.String.valueOf;

@WebServlet("/searchResult.html")
public class SearchServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException ,ServletException
    {
        Model model = ModelFactory.getModel();

        String searchString = request.getParameter("searching");
        List <Integer> ResultIndexName = model.search_PatientName(searchString);
        List <String> ResultPatientName = model.Result(ResultIndexName);

        List <Integer> ResultIndexID = model.search_PatientID(searchString);
        List <String> ResultPatientID = model.Result(ResultIndexID);

        List <Integer> ResultIndexSsn = model.search_PatientSsn(searchString);
        List <String> ResultPatientSsn = model.Result(ResultIndexSsn);

        List <Integer> ResultIndexPassport = model.search_PatientPassport(searchString);
        List <String> ResultPatientPassport = model.Result(ResultIndexPassport);

        List <Integer> ResultIndexDriver = model.search_PatientDriver(searchString);
        List <String> ResultPatientDriver = model.Result(ResultIndexDriver);

        request.setAttribute("searchString", searchString);

        request.setAttribute("ResultIndexName", ResultIndexName);
        request.setAttribute("ResultName",ResultPatientName);

        request.setAttribute("ResultIndexID", ResultIndexID);
        request.setAttribute("ResultID",ResultPatientID);

        request.setAttribute("ResultIndexSsn", ResultIndexSsn);
        request.setAttribute("ResultSsn",ResultPatientSsn);

        request.setAttribute("ResultIndexPassport", ResultIndexPassport);
        request.setAttribute("ResultPassport",ResultPatientPassport);

        request.setAttribute("ResultIndexDriver", ResultIndexDriver);
        request.setAttribute("ResultDriver",ResultPatientDriver);



        // Invoke the JSP page.
        ServletContext context = getServletContext();
        RequestDispatcher dispatch = context.getRequestDispatcher("/searchResult.jsp");
        dispatch.forward(request, response);
    }
}

