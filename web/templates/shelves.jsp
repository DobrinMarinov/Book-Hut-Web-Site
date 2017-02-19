<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Magi
  Date: 19.2.2017 г.
  Time: 22:28 ч.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Shelves</title>
    <link rel="stylesheet" href="../css/shelves.css">
</head>
<body>
    <jsp:include page="menu.jsp"></jsp:include>
    <table>
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
                    <td>${book.title}</td>
                    <td>${book.author}</td>
                    <td>${book.pages}</td>
                    <td hreg="/shelves/edit/${book.title}"><a>Edit</a></td>
                    <td hreg="/shelves/delete/${book.title}"><a>Delete</a></td>

                </tr>
            </c:forEach>
        </tbody>
    </table>


</body>
</html>
