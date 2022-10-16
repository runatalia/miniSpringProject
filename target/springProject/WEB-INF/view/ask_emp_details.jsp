
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
    <body>
        <H2>
            Dear employee enter your information: 
        </H2>
        <br>

        <form:form action ="showDetails" modelAttribute="employee">
            Name <form:input path ="name"/>
            <form:errors path="name"/>
            <br> <br>
            Surname <form:input path ="surname"/>
            <form:errors path="surname"/>
            <br> <br>

            Salary <form:input path ="salary"/>
            <form:errors path="salary"/>
            <br> <br>
            Email <form:input path ="email"/>
            <form:errors path="email"/>
            <br> <br>
            Telephone number <form:input path ="phoneNumber"/>
            <form:errors path="phoneNumber"/>
            <br> <br>
            Department <form:select path="department">        
                <form:options items ="${employee.departments}"/>
            </form:select>
            <br> <br>
            <form:radiobuttons path = "carBrand" items = "${employee.carBrands}"/>
            <br> <br>
            <form:checkboxes path="languages" items="${employee.languageList}"/>       

            <input type="submit" value = "OK"/>



        </form:form>
    </body>
</html>