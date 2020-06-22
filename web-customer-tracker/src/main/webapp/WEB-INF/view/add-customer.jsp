<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<head>
   <title> Save Customer </title>
    <link type="text/css"
            rel="stylesheet"
            href="${pageContext.request.contextPath}/resources/css/style.css">

    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">


</head>

<body>
<div id="wrapper">
    <div id="header">
        <h2>CRM - Customer relationship manger</h2>
    </div>
</div>

<div id="container">
    <h3>save customer</h3>

    <form:form action="saveCustomer" modelAttribute="customer" method="post">
        <form:hidden path="id"/>
        <table>
            <tbody>
            <tr>
                <td><label>first name :</label></td>
                <td><form:input path="firstName"/></td>
            </tr>

            <tr>
                <td><label>last name :</label></td>
                <td><form:input path="lastName"/></td>
            </tr>

            <tr>
                <td><label>email :</label></td>
                <td><form:input path="email"/></td>
            </tr>

            <tr>
                <td><label></label></td>
                <td><input type="submit" value="Save" class="save"></td>
            </tr>

            </tbody>
        </table>
    </form:form>

    <div style="clear: both;" ></div>
    <p>
        <a href="${pageContext.request.contextPath}/customer/list">back to list</a>
    </p>

</div>

</body>
</html>