<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<body>
<c:set var="theLocale"
value="${not empty param.theLocale ? param.theLocale : pageContext.request.locale}"
scope="session" />
<fmt:setLocale value="${theLocale}" />

<fmt:setBundle basename="com.jac.jsp.tgdemo.i18n.resources.mylabels" />




<a href="i18n-messages-test.jsp?theLocale=en_US">English (US)</a>
<a href="i18n-messages-test.jsp?theLocale=es_ES">Español (ES)</a>
<a href="i18n-messages-test.jsp?theLocale=de_DE">Deutsche (DE)</a>
<hr>

<fmt:message key="label.greeting" /><br/><br/>
<fmt:message key="label.firstname" /><i>John</i><br/>
<fmt:message key="label.lastname" /><i>Doe</i><br/>
<fmt:message key="label.welcome" /><br/>
<hr>

Selected Locale: ${theLocale}
</body>
</html>