<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page errorPage="/" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% 
	String url = request.getRequestURL().toString();
	String uri = request.getRequestURI().toString();
	String context = request.getContextPath().toString();
	
	String home = url.substring(0,url.indexOf(uri)) + context;
%>	

	<table width="100%" cellspacing="2" cellpadding="2">
		<tr>
			<td width="5%">&nbsp;</td>
			<td>
				<h4><a href="<%= home %>">Home</a></h4>
			</td>
			<td>
				<h4 align="right"><a href="#">Logout</a></h4>
			</td>
			<td width="5%">&nbsp;</td>
		</tr>
	</table>
