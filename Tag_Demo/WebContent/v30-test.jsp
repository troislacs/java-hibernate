<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = 'c' %>

<html>
<body>

<c:set var="stuff" value="<%=new java.util.Date() %>"/>

Time on server is: 
${stuff}
<br>

Locale on server is (from shorthanded): 
${pageContext.request.locale}
<br/>

Locale on server is(from request): 
<%=request.getLocale() %>
<br/>

</body>
</html>