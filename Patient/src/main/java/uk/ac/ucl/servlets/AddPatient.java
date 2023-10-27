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

@WebServlet("/addPatient.html")
public class AddPatient extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        Model model = ModelFactory.getModel();

        //add patient
        List<String> newPatient = new ArrayList<String>();
        newPatient.add(request.getParameter("PREFIX"));
        newPatient.add(request.getParameter("First Name"));
        newPatient.add(request.getParameter("Last Name"));
        newPatient.add(request.getParameter("ID"));
        newPatient.add(request.getParameter("DRIVERS"));
        newPatient.add(request.getParameter("SSN"));
        newPatient.add(request.getParameter("PASSPORT"));
        newPatient.add(request.getParameter("GENDER"));

        model.addPatient(newPatient);
        ServletContext context = getServletContext();
        RequestDispatcher dispatch = context.getRequestDispatcher("/addPatient.jsp");
        dispatch.forward(request, response);
    }
}
