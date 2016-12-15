<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>

<html>
    <body>
        <c:set var="user" value="${user}"/>
        <c:if test="${user != null}">
            <h2>Congrats, <c:out value="${login}"/>! Your account is created!</h2>
            <p>You should login to start.</p>
            <a href="/context/login.html">Login page</a>
        </c:if>

        <c:set var="email" value="${email}"/>
        <c:if test="${email != null}">
            <p>Email <c:out value="${email}"/> is used by another person: </p>
            <c:set var="temp" value="${1}"/>
        </c:if>

        <c:set var="login" value="${login}"/>
        <c:if test="${login != null}">
            <p>Login <c:out value="${login}"/> is used by another person: </p>
            <c:set var="temp" value="${1}"/>
        </c:if>

        <c:set var="pass" value="${pass}"/>
        <c:if test="${pass != null}">
            <p>You should enter the same password twice</p>
            <c:set var="temp" value="${1}"/>
        </c:if>

        <c:if test="${temp == 1}">
            <p>Try once more time.</p>
            <a href="/context/account.html">Login page</a>
        </c:if>
    </body>
</html>