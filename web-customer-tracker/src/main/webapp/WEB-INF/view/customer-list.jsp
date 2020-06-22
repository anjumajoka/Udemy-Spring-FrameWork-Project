<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri= "http://java.sun.com/jsp/jstl/core" prefix= "c" %>
<!DOCTYPE html>
<html>

<head>

    Customer List

    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/style.css"/>
</head>

<body>

<div id="wrapper">
    <div id="header">

        <h1>CRM - Customer Relationship Manager</h1>

    </div>
</div>

<div id="Table">
    <div id="content">

        <input type="submit" value="Add Customer"
               onclick="window.location.href='showFormForAdd' ; return false;"
               class="add-button"
        />

        <form:form action="search" method="get">
            Search Customer
        <input type="text" name="theSearchName">
            <input type="submit" value="search" class="add-button">

            <p>
                <a href="${pageContext.request.contextPath}/customer/list">back to list</a>
            </p>

        </form:form>

        <table>

            <tr>
                <th> First Name</th>
                <th> Last Name</th>
                <th> Email</th>
                <th> Action</th>
            </tr>

            <c:forEach var="customerData" items="${customer}">
                <c:url var="updateLink" value="/customer/showFormForUpdate">
                    <c:param name="customerId" value="${customerData.id}"/>
                </c:url>

                <c:url var="deleteLink" value="/customer/delete">
                    <c:param name="customerId" value="${customerData.id}"/>
                </c:url>
                    <tr>
                    <td>${customerData.firstName}</td>
                    <td>${customerData.lastName}</td>
                    <td>${customerData.email}</td>
                        <td>
                            <a href="${updateLink}">Update</a>
                            |
                            <a href="${deleteLink}"
                               onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false">
                                Delete</a>
                        </td>
                    </tr>

            </c:forEach>

        </table>

    </div>
</div>

</body>
</html>