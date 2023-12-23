<%-- 
    Document   : home
    Created on : Dec 17, 2023, 5:57:55 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Menu nhập liệu</title>
  <style>
    body {
      font-family: sans-serif;
    }

    nav {
      background-color: #000;
      color: #fff;
      padding: 10px;
      margin: 0 auto;
      width: 50%;
    }

    ul {
      list-style-type: none;
      margin: 0;
      padding: 0;
    }

    li {
      display: inline-block;
      margin-right: 10px;
    }

    a {
      text-decoration: none;
    }

    .active {
      background-color: #fff;
      color: #000;
    }
  </style>
</head>
<body>
  <nav>
    <ul>
      <li><a href="#">Trang chủ</a></li>
    </ul>
  </nav>

  <div class="content">
    <h1>Menu nhập liệu</h1>

    <p>Chọn một mục để nhập liệu:</p>

    <ul>
      <li><a href="loadalbum">Album</a></li>
      <li><a href="load">Loại Album</a></li>
      <li><a href="load">Nghệ sỹ</a></li>
      <li><a href="load">Kỳ bình chọn</a></li>
      <li><a href="load">Nghệ sỹ album</a></li>
      <li><a href="load">Người bình chọn</a></li>
      <li><a href="load">Phiếu bình chọn</a></li>
      <li><a href="load">Thang điểm bình chọn</a></li>
    </ul>
  </div>
</body>
</html>
