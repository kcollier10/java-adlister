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
    <title>Guessing Game!</title>
</head>
<body>
    <form action="guess" method="post">
        <label for="entry">Enter a number between 1 and 5:</label>
        <input type="number" id="entry" name="entry">
        <button>Submit</button>
    </form>

</body>
</html>
