<html>
<head><title>Confirmation</title></head>
	<%
		// read from data
			String favLang = request.getParameter("favoriteLanguage");	
		//create the cookie
			Cookie theCookie = new Cookie("myApp.favoriteLanguage",favLang);	
		//set the life span ... total number of seconds
			theCookie.setMaxAge(60*60*24*365);	
		//send cookie to browser
			response.addCookie(theCookie);
	%>
<body>
	Thanks. We added your favorite language to: ${param.favoriteLanguage }<br/><br/>
	<a href="v28a_cookies-homepage.jsp">Return to home</a>
<body>
</html>

