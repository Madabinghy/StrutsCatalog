<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Catalogue</title>
</head>
<body>
	<s:text name="Liste des produits : " /><br/>
	Il y a :<s:property value="%{lesProduits.size}"/><br/> produits !
	<br/>
	<s:iterator value="lesProduits">
		<s:property value="nom" /><br/>
		<s:property value="description" /><br/>
		<s:property value="prix" /><br/>
	</s:iterator>
	<a href="index.jsp">retour</a>
</body>
</html>