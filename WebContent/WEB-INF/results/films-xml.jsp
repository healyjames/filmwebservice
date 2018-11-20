<%@ page import="java.util.List" %>
<%@ page import="javax.xml.bind.JAXBContext" %>
<%@ page import="javax.xml.bind.JAXBException" %>
<%@ page import="javax.xml.bind.Marshaller" %>
<%@ page import="com.google.gson.Gson" %>
<%@ page import="model.Film" %>
<%@ page import="model.FilmList" %>
<%@ page trimDirectiveWhitespaces="true" %>

<%

FilmList film = new FilmList((List<Film>) request.getAttribute("films"));

try {
	
	JAXBContext jContext = JAXBContext.newInstance(FilmList.class);
	Marshaller jMarshaller = jContext.createMarshaller();
	
	jMarshaller.marshal(film, out);
	
}catch(JAXBException e){ e.printStackTrace(); }

%>