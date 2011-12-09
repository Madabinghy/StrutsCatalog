<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bienvenue sur le site marchand</title>
</head>
<body>
<a href="createProducts.jsp">creer un produits</a>

    <s:form action="GetProducts" method="post">
        <s:submit value="consulter produits"></s:submit>
    </s:form>
     <s:form action="CreateProducts" method="post">
        <s:submit value="creer produits"></s:submit>
    </s:form>   
     <s:form action="CreateOneProduct" method="post ">
        <s:submit value="creer un produit"></s:submit>
    </s:form>    
</body>
</html>