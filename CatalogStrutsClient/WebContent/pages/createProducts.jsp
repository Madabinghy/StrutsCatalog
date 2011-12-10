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
	<s:text name="Creer un produit : " />
	<br><s:form action="CreateOneProduct" method="post">
		<s:textfield name="nom" label="nom"></s:textfield>
		<s:textarea name="description" label="description"></s:textarea>
		<s:textfield name="prix" label="prix"></s:textfield>
		<s:submit value="creer le produits"></s:submit>
	</s:form>

	<a href="index.jsp">retour</a>
</body>
</html>