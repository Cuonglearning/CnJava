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
                    <th>Tên Album</th>
                    <th>Mã loại Album</th>
                    <th>Thời lượng</th>
                    <th>Đạo diễn</th>
                    <th>Nhà sản xuất</th>
                    <th>Năm sản xuất</th>
                    <th>Chủ đề</th>
                    <th>Ngày phát hành</th>
                    <th>Đơn giá</th>
                    <th>Ghi chú</th>
                </tr>
                <c:forEach items="${listA}" var="x">
                <tr>
                    <td>${x.maAlbum}</td>
                    <td>${x.tenAlbum}</td>
                    <td>${x.maLoaiAlbum}</td>
                    <td>${x.thoiLuong}</td>
                    <td>${x.daoDien}</td>
                    <td>${x.nhaSanXuat}</td>
                    <td>${x.namSanXuat}</td>
                    <td>${x.chuDe}</td>
                    <td>${x.ngayPhatHanh}</td>
                    <td>${x.donGia}</td>
                    <td>${x.ghiChu}</td>
                    <td>
                        <a href="updatealbum?maAlbum=${x.maAlbum}">update</a>
                        <a href="deletealbum?maAlbum=${x.maAlbum}">delete</a>
                    </td>
                </tr>
            </c:forEach>

        </table>
            <a href="AddAlbum.jsp">Thêm</a>    
    </body>
</html>
