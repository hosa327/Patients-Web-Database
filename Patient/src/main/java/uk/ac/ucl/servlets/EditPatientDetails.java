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

@WebServlet("/EditPatientDetails")
public class EditPatientDetails extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        Model model = ModelFactory.getModel();

        Integer index = Integer.parseInt(request.getParameter("id"));
        String newContent = request.getParameter("content");
        model.edit(index, newContent);

        response.sendRedirect(request.getContextPath() + "/patientList.html");
    }
}
