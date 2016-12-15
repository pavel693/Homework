<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>

<html>
    <body>
        <h2>Thank you, you are logged in</h2>
        <br/>
        <a href="/context/allbooks">The List of Books</a>

        <br/>
        <p>
        <form action="/context/logout">
             <c:if test="${cookie.containsKey('login')}">
                <input type="submit" value="Log Out" />
             </c:if>
        </form>
        </p>
    </body>
</html>