package uk.ac.ucl.servlets;

import uk.ac.ucl.model.Model;
import uk.ac.ucl.model.ModelFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/patientDetails.html")
public class ViewPatientDetails extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        Model model = ModelFactory.getModel();

        List<String> patientDetails = model.getPatientDetails();
        List<String> patientWholeName = model.getPatientWholeNames();

        request.setAttribute("patientDetails", patientDetails);
        request.setAttribute("patientWholeName", patientWholeName);

        int index = Integer.parseInt(request.getParameter("index"));
        request.setAttribute("index", index);

        ServletContext context = getServletContext();
        RequestDispatcher dispatch = context.getRequestDispatcher("/patientDetails.jsp");
        dispatch.forward(request, response);
    }
}
