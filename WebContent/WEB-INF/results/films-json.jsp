<%@ page import="java.util.List" %>
<%@ page import="com.google.gson.Gson" %>
<%@ page import="model.Film" %>

<%

List<Film> films = (List<Film>) request.getAttribute("films");
Gson gson = new Gson();

String json = gson.toJson(films);

response.getWriter().println(json);

%>