<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="models.bindingModels.LoginModel" %>
<%@ page import="config.Config" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Menu</title>
    <link rel="stylesheet" href="../css/menu.css">
</head>
<body>

    <ul>
        <li><a href="/">Home</a></li>
        <li><a href="/signup">Sign Up</a></li>
        <%LoginModel loginModel = (LoginModel) session.getAttribute(Config.LOGIN_MODEL);
            if(loginModel != null) {
                String username = loginModel.getUsername();
                request.setAttribute(Config.USERNAME, username);
            }
        %>
        <c:set var="username" value="${USERNAME}"/>
        <c:choose>
            <c:when test="${username != null}">
                <li><a href="/signout">Sign Out (${username})</a></li>
            </c:when>
            <c:otherwise>
                <li><a href="/signin">Sign In</a></li>
            </c:otherwise>
        </c:choose>

        <li><a href="/add">Add</a></li>
        <li><a href="/shelves">Shelves</a></li>
    </ul>

</body>
</html>
