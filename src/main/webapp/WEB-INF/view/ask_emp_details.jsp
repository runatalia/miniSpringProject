
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
    <html>
        <body
               <H2>
           Dear employee enter your information: 
        </H2>
            <br>
            <br>
            <form:form action ="showDetails" modelAttribute="employee">
                Name <form:input path ="name"/>
                <br>
                Surname <form:input path ="surname"/>
                <br>
                Salary <form:input path ="salary"/>
                <br>
                Department <form:select path="department">        
                    <form:options items ="${employee.departments}"/>
                </form:select>
                    <br>
                    <form:radiobuttons path = "carBrand" items = "${employee.carBrands}"/>
                    <form:checkboxes path="languages" items="${employee.languageList}"/>       

                <input type="submit" value = "OK"/>
                
                
        
    </form:form>
</body>
</html>