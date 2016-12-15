<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>

<html>
    <body>
        <h2>This goods in your cart:</h2>
        <c:forEach items="${books}" var="someBook">
            <p>
            <c:out value="${someBook.name}" />,
            <c:out value="${someBook.author}" />,
            <c:out value="${someBook.genre}" />,
            <c:out value="${someBook.price}" />USD
            </p>
        </c:forEach>
        <br/>
        <a href="/context/allbooks">The List of Books</a>
        <p></p>
        <form action="/context/logout">
            <c:if test="${cookie.containsKey('login')}">
                <input type="submit" value="Log Out" />
            </c:if>
        </form>
    </body>
</html>