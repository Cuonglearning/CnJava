/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlAlBUM;

import dao.ALBUMDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebServlet(name = "AddControlAlbum", urlPatterns = {"/addalbum"})
public class AddControlAlbum extends HttpServlet {

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
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddControlAlbum</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddControlAlbum at " + request.getContextPath() + "</h1>");
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
      //  processRequest(request, response);
      String smaAlbum=request.getParameter("maAlbum");
      String stenAlbum=request.getParameter("tenAlbum");
      String smaLoaiAlbum=request.getParameter("maLoaiAlbum");
      String sthoiLuong=request.getParameter("thoiLuong");
      String sdaoDien=request.getParameter("daoDien");
      String snhaSanXuat=request.getParameter("nhaSanXuat");
      String snamSanXuat=request.getParameter("namSanXuat");
      String schuDe=request.getParameter("chuDe");
      String sngayPhatHanh=request.getParameter("ngayPhatHanh");
      String sdonGia=request.getParameter("donGia");
      String sghiChu=request.getParameter("ghiChu");
      
        ALBUMDAO dao=new ALBUMDAO();
        dao.themALBUM(smaAlbum, stenAlbum,smaLoaiAlbum, sthoiLuong,sdaoDien, snhaSanXuat,snamSanXuat, schuDe,sngayPhatHanh, sdonGia,sghiChu);
        response.sendRedirect("loadalbum");
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
