<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>

<html>
    <body>
        <form action="/context/cart">
            <h2>Detail information about the book "${book.name}"</h2>
            <p>
                <c:out value="${book.name}" />
            </p>
            <p>
                <c:out value="${book.author}" />
            </p>
            <p>
                <c:out value="${book.genre}" />
            </p>
            <p>
                <c:out value="${book.price}" /> USD
            </p>
            <h3>Some information about the book from the DB</h3>
            <input type="submit" value="Add to Cart" />
            <input type="hidden" name="id" value="<c:out value="${book.id}"/>" />
        </form>
        <br/>
        <form action="/context/logout">
            <c:if test="${cookie.containsKey('login')}">
                <input type="submit" value="Log Out" />
            </c:if>
        </form>
    </body>
</html>