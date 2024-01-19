<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<body>
<form:form action="Viewpage" modelAttribute="empl">
<form:input path="id"/>
<form:input path="Name"/>
<form:input path="sallary"/>
<form:input path="designation"/>
<input type="submit" value="Save">
</form:form>
</body>
</html>