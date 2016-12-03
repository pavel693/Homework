<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <body>
        <h1>Students List</h1>
        <c:forEach items="${books}" var="someBook">
                    <p>
                        <c:out value="${someBook.name}" />
                        <c:out value="${someBook.author}" />
                        <c:out value="${someBook.genre}" />
                    </p>
        </c:forEach>
    </body>
<html>