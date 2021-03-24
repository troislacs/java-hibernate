<%@ page import="java.util.*" %>
<html>
<body>
<!-- Step1: Create HTML form -->
<form action="v27_session-ToDo.jsp">
	Add new item:<input type="text" name="theItem"/>
	<input type="submit" value="Submit"/>
</form>
<!-- Step2: Add new items to "To do" list -->
	<%
		//get the TO DO items from the session
			List<String> items = (List<String>)session.getAttribute("myToDoList");		
		//if the TO DO items doesn't exist, then create a new one
			if(items==null){items = new ArrayList<String>();
				session.setAttribute("myToDoList", items);	}		
		//check if there is form data to add
			String theItem = request.getParameter("theItem");
			if(theItem!=null){items.add(theItem);}
	%>
<!-- Step3: Display all "To Do" Items from session -->
<hr>
<b>To Do List</b>
<ol>
	<% for(String temp:items){out.println("<li>"+ temp + "</li>");} %>
</ol>
</body>
</html>
