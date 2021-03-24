 <html>
<body>
<% out.println(request.getMethod()); %>
<hr/>
<% out.println(request.getLocale()); %> 
<hr/>
<% out.println(request.getHeader("user-agent")); %>
<hr/>
</body>
</html>