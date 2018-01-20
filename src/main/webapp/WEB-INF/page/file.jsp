<%--
  Created by IntelliJ IDEA.
  User: lees
  Date: 2018/1/20
  Time: 07:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传展示</title>
</head>
<body>
    <div align="center">
        <h1>上传附件</h1>
        <form method="post"action="/uploadfile/beginUpload/"enctype="multipart/form-data" >
            <input type="file" name="file"/>
            <input type="submit"/>
        </form>

    </div>
</body>
</html>
