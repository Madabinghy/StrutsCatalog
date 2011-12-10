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
	Il y a :<s:property value="%{lesProduits.size}"/> produits !
	<br/>
	<s:form action="DeleteProducts" method="post">
	<s:iterator value="lesProduits">
		<table border="2" bordercolor="black" style="width: 568px; ">
			<tr>
				<td>Nom</td><td style="width: 200px; ">Description</td><td>Prix</td><td>Supprimer?</td>
			</tr>
			<tr>
				<td><s:property value="nom" /></td>
				<td><s:property value="description" /></td>
				<td ><s:property value="prix" /></td> 
				<td><s:checkbox name="productTodelete" fieldValue="%{nom}" ></s:checkbox></td>
			</tr>
			
		</table>
	</s:iterator>
	<s:submit value="supprimer"></s:submit>
	</s:form>

	<a href="index.jsp">retour</a>
</body>
</html>