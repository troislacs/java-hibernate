<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<body>

<c:set var="data" value="JohnAbbottCollege" />

Length of the string <b>${data}</b>:${fn:length(data)}
<br/><br/>

The uppercase version of the string <b>${data}</b>:${fn:toUpperCase(data)}
<br/><br/>

Does the string <b>${data}</b> starts with <b>Johnson</b>?: ${fn:startsWith(data,"Johnson")}
</body>
</html>
 