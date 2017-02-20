<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Shelves</title>
    <link rel="stylesheet" type="text/css" href="/css/shelves.css">
</head>
<body>
    <jsp:include page="menu.jsp"></jsp:include>
    <table class="tb">
        <thead>
            <th>Title</th>
            <th>Author</th>
            <th>Pages</th>
            <th>Edit</th>
            <th>Delete</th>
        </thead>
        <tbody>
            <c:set var="books" value="${VIEW_MODEL_LIST}"/>
            <c:forEach items="${books}" var="book">
                <tr>
                    <td>
                        <c:out value="${book.title}"/>
                    </td>
                    <td>
                        <c:out value="${book.author}"/>
                    </td>
                    <td>
                        <c:out value="${book.pages}"/>
                    </td>
                    <td>
                        <a href="/shelves/edit/${book.title}">Edit</a>
                    </td>
                    <td>
                        <a href="/shelves/delete/${book.title}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>


</body>
</html>
