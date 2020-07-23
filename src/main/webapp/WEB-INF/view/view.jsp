<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Employees List</h1>
<table>
  <c:forEach var="emp" items="${list}">
        <tr>
            <td>${emp.eid}</td>
            <td>${emp.ename}</td>
            <td><a href="editsave/${emp.eid}">Edit</a></td>
            <td><a href="deleteemp/${emp.eid}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
<br/>
<a href="empform">Add New Employee</a>