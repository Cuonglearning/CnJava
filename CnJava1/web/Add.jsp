<%-- 
    Document   : Add
    Created on : Oct 12, 2020, 9:17:52 PM
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
        <form action="add" method="post">
            <table>
                <tr>
                    <td>Mã Album</td>
                    <td>
                        <input type="text" name="maAlbum">
                    </td>
                <tr>
                    <td>Mã nghệ sỹ</td>
                    <td><input type="text" name="maNgheSy"</td>
                </tr>
                <tr>
                    <td></td>
                    <td><button type="submit">Thêm</button></td>
                </tr>
            </table>
        </form>
    </body>
</html>
