<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>

<html>
    <body>
        <h1>Books List</h1>
        <c:forEach items="${books}" var="someBook">
            <p>
            <form action="/context/bookpage">
                <c:out value="${someBook.name}" />,
                <c:out value="${someBook.author}" />,
                <c:out value="${someBook.genre}" />,
                <c:out value="${someBook.price}" />USD
                <input type="submit" value="Detail" />
                <input type="hidden" name="id" value="<c:out value="${someBook.id}"/>" />
            </form>
            </p>
        </c:forEach>
        <br/>
        <form action="/context/logout">
            <c:if test="${cookie.containsKey('login')}">
                <input type="submit" value="Log Out" />
            </c:if>
        </form>
    </body>
<html>