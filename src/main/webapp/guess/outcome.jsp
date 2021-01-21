<%--
  Created by IntelliJ IDEA.
  User: kristencollier
  Date: 1/21/21
  Time: 4:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guessing Game Outcome</title>
</head>
<body>
    <c:choose>
        <c:when test="${url.equals('/incorrect')}">
            <h3>Sorry, number did not match.</h3><br>
            <h5>You entered: ${entry}</h5>
            <br>
            <h5>Random number was: ${random}</h5>
        </c:when>
        <c:otherwise>
            <h3>Number matched, you win!!</h3>
            <br>
            <h5>You entered: ${entry}</h5>
            <br>
            <h5>Random number: ${random}</h5>
        </c:otherwise>
    </c:choose>
</body>
</html>