<%-- 
    Document   : Update
    Created on : Oct 12, 2020, 8:29:35 PM
    Author     : trinh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
    body {
      font-family: sans-serif;
    }

    form {
      margin-top: 20px;
    }

    input {
      width: 100%;
      margin-bottom: 10px;
      padding: 5px;
    }

    button {
      background-color: #000;
      color: #fff;
      padding: 10px;
    }
  </style>
    <body>
        <nav>
    <ul>
      <li><a href="home.jsp">Trang chủ</a></li>
    </ul>
  </nav>
        <form action="updatealbum" method="post">
            <table>
                <tr>
                    <td>Mã Album</td>
                    <td>
                        <input value="${a.maAlbum}" type="text" name="maAlbum" readonly>
                    </td>
                </tr>
                <tr>
                    <td>Tên Album</td>
                    <td>
                        <input value="${a.tenAlbum}" type="text" name="tenAlbum">
                    </td>
                </tr>
                <tr>
                    <td>Mã loại Album</td>
                    <td>
                        <input value="${a.maLoaiAlbum}" type="text" name="maLoaiAlbum" >
                    </td>
                </tr>
                <tr>
                    <td>Thời lượng</td>
                    <td>
                        <input value="${a.thoiLuong}" type="text" name="thoiLuong">
                    </td>
                </tr>
                <tr>
                    <td>Đạo diễn </td>
                    <td>
                        <input value="${a.daoDien}" type="text" name="daoDien" >
                    </td>
                </tr>
                <tr>
                    <td>Nhà sản xuất  </td>
                    <td>
                        <input value="${a.nhaSanXuat}" type="text" name="nhaSanXuat">
                    </td>
                </tr>
                <tr>
                    <td>Năm sản xuất</td>
                    <td>
                        <input value="${a.namSanXuat}" type="text" name="namSanXuat" >
                    </td>
                </tr>
                <tr>
                    <td>Chủ đề</td>
                    <td>
                        <input value="${a.chuDe}" type="text" name="chuDe">
                    </td>
                </tr>
                <tr>
                    <td>Ngày phát hành</td>
                    <td>
                        <input value="${a.ngayPhatHanh}" type="text" name="ngayPhatHanh" >
                    </td>
                </tr>
                <tr>
                    <td>Đơn giá</td>
                    <td>
                        <input value="${a.donGia}" type="text" name="donGia">
                    </td>
                </tr>
                <tr>
                    <td>Ghi chú</td>
                    <td>
                        <input value="${a.ghiChu}" type="text" name="ghiChu" >
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><button type="submit">Update</button></td>
                </tr>
            </table>
        </form>
    </body>
</html>
