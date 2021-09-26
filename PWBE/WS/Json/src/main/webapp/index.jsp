<%@page import="org.json.JSONArray"%>
<%@page import="org.json.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	JSONObject obj = new JSONObject("{\"id\":5,\"nome\":\"Fulano\"}");
	
	out.print(obj.getInt("id"));
	
	JSONObject obj2 = new JSONObject();
	
	obj2.put("endereco", "Rua sem saida");
	
	obj2.put("casado", false);
	
	obj2.put("numero",13);
	
	out.print(obj2.toString());
	
	JSONArray arr = new JSONArray();
	
	JSONObject obj3 = new JSONObject();
	
	obj3.put("endereco","Rua das andorinhas");
		
	obj3.put("casado", false);
	
	obj3.put("numero",13);
	
	arr.put(obj2);
	arr.put(obj3);
	
	out.print(arr.toString());
	
	out.print(arr.getJSONObject(1));
	
	
	
	%>
</body>
</html>