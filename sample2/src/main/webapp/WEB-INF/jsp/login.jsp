<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

       <form:form method="post" action="Login">  
    <table>
<tr><td>LoginId</td><td><form:input path="loginid" /></td></tr>
<tr><td>Password</td><td><form:input path="password" /></td></tr>
<tr><td><input type="submit" value="Login"></td></tr>
</table>
</form:form> 