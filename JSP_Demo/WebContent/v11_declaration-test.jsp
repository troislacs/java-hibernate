<html>
<body>
<h3>Declaration Test</h3>
<%!
String makeItLower(String data){
	return data.toLowerCase();
}
%>

To make it lower case ___ <%=makeItLower("FUN FUN FUN") %>

<%!
    float pi = 3.1415926f;

    float calculateArea(float radius){
    	return pi*radius*radius;
    }
%>

<%
  for(float i=1.0f; i<=5.0f; i++){
	  out.println("<br/>Area of a circle with radius of " + i + "  is: " + calculateArea(i));
	  
  }
%>
</body>
</html>