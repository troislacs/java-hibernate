<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<body>

<!-- Use jsp core to setup "theLocale" variable -->
<c:set var="theLocaleX"
value="${not empty param.theLocale ? param.theLocale : pageContext.request.locale}"
scope="session" />

<!-- Use jsp messages-formatting i18n to assign locale value to theLocale -->
<fmt:setLocale value="${theLocaleX}" />

<!-- Use jsp i18n to set bundles (defines the lable file location) -->
<fmt:setBundle basename="com.java3midterm.resources.movielabels" />

<!-- Assign the theLocale value based on user's choice -->
<a href="jave3-midterm-i18n.jsp?theLocale=en_US">English (US)</a>
<a href="jave3-midterm-i18n.jsp?theLocale=fr_CA">French (CA)</a>
<hr>

<!-- Use the placeholder(label) instead of hard code -->
<fmt:message key="label.movietitle" />:&nbsp;The Shawshank Redemption<br/>
<fmt:message key="label.year" />:&nbsp;1994<br/>
<fmt:message key="label.director" />:&nbsp;Frank Darabont<br/>
<fmt:message key="label.country" />:&nbsp;USA<br/>
<hr>

Selected Locale: ${theLocaleX}
</body>
</html>