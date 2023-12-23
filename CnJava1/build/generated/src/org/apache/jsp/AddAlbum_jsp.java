package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddAlbum_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("    body {\n");
      out.write("      font-family: sans-serif;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    form {\n");
      out.write("      margin-top: 20px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    input {\n");
      out.write("      width: 100%;\n");
      out.write("      margin-bottom: 10px;\n");
      out.write("      padding: 5px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    button {\n");
      out.write("      background-color: #000;\n");
      out.write("      color: #fff;\n");
      out.write("      padding: 10px;\n");
      out.write("    }\n");
      out.write("  </style>\n");
      out.write("    <body>\n");
      out.write("        <nav>\n");
      out.write("    <ul>\n");
      out.write("      <li><a href=\"home.jsp\">Trang chủ</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </nav>\n");
      out.write("        <form action=\"addalbum\" method=\"post\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Mã Album</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"maAlbum\">\n");
      out.write("                    </td>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Tên Album</td>\n");
      out.write("                    <td><input type=\"text\" name=\"tenAlbum\"</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Mã loại Album</td>\n");
      out.write("                    <td><input type=\"text\" name=\"maLoaiAlbum\"</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Thời lượng</td>\n");
      out.write("                    <td><input type=\"text\" name=\"thoiLuong\"</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Đạo diễn</td>\n");
      out.write("                    <td><input type=\"text\" name=\"đaoDien\"</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Nhà sản xuất</td>\n");
      out.write("                    <td><input type=\"text\" name=\"nhaSanXuat\"</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Năm sản xuất</td>\n");
      out.write("                    <td><input type=\"text\" name=\"namSanXuat\"</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Chủ đề</td>\n");
      out.write("                    <td><input type=\"text\" name=\"chuDe\"</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Ngày phát hành</td>\n");
      out.write("                    <td><input type=\"text\" name=\"ngayPhatHanh\"</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Đơn giá</td>\n");
      out.write("                    <td><input type=\"text\" name=\"donGia\"</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Ghi chú</td>\n");
      out.write("                    <td><input type=\"text\" name=\"ghiChu\"</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td><button type=\"submit\">Thêm</button></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
