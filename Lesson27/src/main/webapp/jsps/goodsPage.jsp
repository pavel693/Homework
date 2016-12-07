<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <body>
        <h1>Books List</h1>
        <form action="/context">
            <c:forEach items="${books}" var="someBook">
                    <p>
                        <c:out value="${someBook.name}" />
                        <c:out value="${someBook.author}" />
                        <c:out value="${someBook.genre}" />
                        <c:out value="${someBook.price}" />
                        <input type="submit" value="Buy" />
                    </p>
            </c:forEach>
        </form>
    </body>
<html>