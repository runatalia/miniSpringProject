
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
    <html>
        <body><!-- comment -->
        <H2>
        Dear employee welcome!
        </H2>
            <br>
            <br>
            Your name: ${employee.name}
            <br>
            Your surname: ${employee.surname}
            <br>
            Your salary: ${employee.salary}
            <br>
            Your departments: ${employee.salary}
            <br>
            Your car: ${employee.carBrand}
            <br>
            Languages: <ul><c:forEach var="lang"
                       items="${employee.languages}">
                       <li>
                           ${lang}
                           </li>
            </c:forEach>
             </ul>
        </body>
    </html>
