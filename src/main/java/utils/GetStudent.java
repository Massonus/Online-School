package utils;

import entities.Student;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import repositories.StudentRepo;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/entities/Student", initParams = @WebInitParam(name = "name", value = "jon"))
public class GetStudent extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        String name = req.getParameter("name");

        if (name == null) {
            name = getInitParameter("name");
        }

        final Student deviceByName = StudentRepo.getStudentByName(name);

        PrintWriter writer = resp.getWriter();
        writer.println("<h2>Hello " + deviceByName + "</h2>");

        writer.close();
    }
}
