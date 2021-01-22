<%--
  Created by IntelliJ IDEA.
  User: kristencollier
  Date: 1/22/21
  Time: 2:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>Here are all the products:</h1>

<c:forEach var="ad" items="${ads}">
    <div class="product">
        <h2>${ad.title}</h2>
        <p>${ad.id}</p>
        <p>Description: ${ad.description}</p>
    </div>
</c:forEach>

</body>
</html>
