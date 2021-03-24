<html>
<head>
<title>Student Confirmation</title>
</head>
<body>

<!-- Shortcut to read form data -->
The student is confirmed: ${param.firstname} ${param.lastname }
<br/>

<!-- Regular way to read form data:  [request.getParameter("")] -->
Your nationality is: <%=request.getParameter("nationality") %>
</body>
</html>