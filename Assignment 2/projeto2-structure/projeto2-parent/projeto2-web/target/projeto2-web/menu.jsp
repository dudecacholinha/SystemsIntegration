<%--
  Created by IntelliJ IDEA.
  User: joaom
  Date: 03/11/2019
  Time: 16:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Menu Inicial</title>
</head>
<body>
<h1>Aquele menu inicial que nem é bom</h1>
<!-- USER-->
<h2>Account Operations</h2>
<h3>Edit personal information</h3>
<h3>Delete account</h3>
<br>

<!-- ITEM -->
<h2>Item Operations</h2>
<h2>List all items that I have for sale</h2>
<h3>Put a new item for sale</h3>
<h3>Edit item information</h3>
<h3>Delete an item</h3>
<br>

<!-- SEARCH -->
<h2>Search Operations</h2>
<a href="${pageContext.request.contextPath}/ItemServ" >Search for all items</a><br />
<!--a id="search_category" onclick="location.href='@Url.Action(ItemServ)'">SSearch inside a certain category</a><br /> -->
<h3>Search within a price range</h3>
<h3>Search in my country</h3>
<h3>Search items published after a given date</h3>

<br>
<a href="index.html">Logout</a>
</body>
</html>