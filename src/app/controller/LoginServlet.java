package app.controller;

import app.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {
    User usuario = new User();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        usuario.setNombre("Juan");
        usuario.setPassword("password");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Login Servlet</title>");
            out.println("<link rel='stylesheet' href='style.css'/>");
            out.println("</head>");
            out.println("<body>");
            if (request.getParameter("user").equals(usuario.getNombre()) && request.getParameter("pass").equals(usuario.getPassword())) {
                response.sendRedirect("Biblioteca");
            } else {
                out.println("<script>Swal.fire({"
                        + "icon: 'error',"
                        + "title: 'Datos incorrectos',"
                        + "text: 'Intenta de nuevo'"
                        + "}).then(function(){"
                        + "location.href='index.jsp'});</script>");
            }
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}