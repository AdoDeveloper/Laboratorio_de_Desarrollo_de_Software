/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "ServletPrincipal", urlPatterns = {"/ServletPrincipal"})
public class ServletPrincipal extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
         out.println("<!DOCTYPE html>");
         out.println("<html lang=\"es\">");
         out.println("<head>");
         out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
         out.println("<title>Mensaje del Registro</title>"); 
         out.println("<link rel=\"stylesheet\" href=\"servlet.css\">");
         out.println("</head>");
         out.println("<body>");
            
         String nombreProducto = request.getParameter("tfNombreProducto");
         String descripcion = request.getParameter("tfDescripcion");
         String precio = request.getParameter("tfPrecio");
         String existencia = request.getParameter("tfExistencia");
         
         out.println("<div class=\"contenedor\">");
         out.println("<h1>Registro exitoso del producto</h1>");
         out.println("<strong>Nombre del Producto: </strong>"+nombreProducto);
         out.println("<br><strong>Descripción: </strong>"+descripcion);
         out.println("<br><strong>Precio Unitario: </strong>"+"$"+precio);
         out.println("<br><strong>Existencia: </strong>"+existencia);
         out.println("<input type=\"button\" class=\"boton\" value=\"INGRESAR OTRO PRODUCTO\" onclick=\"location.href='index.html'\">");
         out.println("</div>");

         out.println("</body>");
         out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
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
