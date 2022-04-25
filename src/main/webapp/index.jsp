<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="api">Hello Servlet</a> <br>
<a href="api/db">Hello Servlet db</a> <br>

<form id="forma" method="post" action="api/form">
    <input type="text" name="title[]" placeholder="texter" value="timi"/> <br />
    <input type="text" name="title[]" placeholder="texter" value="tami"/> <br />
    <input type="text" name="title[]" placeholder="texter" value="tomi"/> <br />
    <input type="submit" />
</form>




</body>
</html>