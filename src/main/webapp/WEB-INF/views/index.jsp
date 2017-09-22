<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>
</head>
<body>
<table>
    <thead>
        <tr>
            <th>Matricule</th>
            <th>Last Name</th>
            <th>First Name</th>
            <th>Address</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${ employees }" var="employee">
            <tr>
                <td><c:out value="${ employee.matriculeRegistration }" /></td>
                <td><c:out value="${ employee.lastName }" /></td>
                <td><c:out value="${ employee.firstName }" /></td>
                <td><c:out value="${ employee.address }" /></td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>