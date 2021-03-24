<html>
<head>
<title>Student Confirmation</title>
</head>
<body>
<!-- Shortcut to read form data -->
The student is confirmed: ${param.firstname} ${param.lastname }
<br/><br/><br/>
<!--  display the list of "favoritelanguage" -->
This student's favorite programming language(s) is(/are):
<br/>
<ul>
	<%String[] langs = request.getParameterValues("favoriteLanguage");
	if(langs != null){
	for(String langsTemp:langs){
		out.print("<li>"+ langsTemp + "</li>");}}%>
</ul>
</body>
</html>