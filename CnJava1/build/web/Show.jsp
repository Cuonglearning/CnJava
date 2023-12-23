<%-- 
    Document   : Show
    Created on : Oct 12, 2020, 8:15:41 PM
    Author     : trinh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>JSP Page</title>
        </head>
        <body>
            <nav>
    <ul>
      <li><a href="home.jsp">Trang chủ</a></li>
    </ul>
  </nav>
            <table border="1px solid black">
                <tr>
                    <th>Mã Album</th>
                    <th>Mã nghệ sỹ</th>
                </tr>
                <c:forEach items="${listNA}" var="x">
                <tr>
                    <td>${x.maAlbum}</td>
                    <td>${x.maNgheSy}</td>
                    <td>
                        <a href="update?maAlbum=${x.maAlbum}">update</a>
                        <a href="delete?maAlbum=${x.maAlbum}">delete</a>
                    </td>
                </tr>
            </c:forEach>

        </table>
            <a href="Add.jsp">Thêm</a>    
    </body>
</html>
