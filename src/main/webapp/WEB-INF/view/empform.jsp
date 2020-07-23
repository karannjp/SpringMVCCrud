<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<h1>Add New Employee</h1>
<form:form method="post" action="save">
    <table >
    <tr>
    <td>EID : </td>
    <td><form:input path="eid"  /></td>
    </tr>
    <tr>
    <td>EName :</td>
    <td><form:input path="ename" /></td>
    </tr>
        <td><input type="submit" value="Submit"></td>
        </tr>

    </table>

</form:form>