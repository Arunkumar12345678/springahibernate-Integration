<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

  <center><b>Registration</b></center>
<form:form method="post" action="Register">  

<table>
<tr><td>Name</td><td><form:input path="Name" /></td></tr>
<tr><td>Age</td><td><form:input path="Age" /></td></tr>
<tr><td>PhoneNumber</td><td><form:input path="PhoneNumber" /></td></tr>
<tr><td>Email</td><td><form:input path="Email" /></td></tr>
<tr><td>LoginId</td><td><form:input path="LoginId" /></td></tr>
<tr><td>Password</td><td><form:input path="Password" /></td></tr>
<tr><td><input type="submit" value="Register"></td></tr>


</table>

</form:form>
<%
if(request.getAttribute("errorReason")!=null)
{ 
%>

<font color="red"><%= request.getAttribute("errorReason") %></font>

<% 
}
%>

</body>
</html>