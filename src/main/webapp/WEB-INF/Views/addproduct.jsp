<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Product Index</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">



</head>
<body>
 <h2>Add Product Data</h2>
<div class="container">
<form:form method="POST" action="https://lovalhost:8081/EcommersProject/save" modelAttribute="productEntity"> 

   <table>
       <tr>
           <td><form:label path="prodId ">Product ID:</form:label></td>
           <td><form:input path="prodId" value="${productEntity.prodId}" /></td>
       </tr>
       
        <tr>
           <td><form:label path="prodName">Product Name:</form:label></td>
           <td><form:input path="prodName" value="${productEntity.prodName}" /></td>
       </tr>
       
       
       
        <tr>
           <td><form:label path="description">Product Description:</form:label></td>
           <td><form:input path="description" value="${productEntity.description}"/></td>
       </tr>
       
       <tr>
           <td><form:label path="prodPrice">Product Price:</form:label></td>
           <td><form:input path="prodPrice" value="${productEntity.prodPrice}"/></td>
       </tr>
       
        <tr>
           <td><form:label path="image">Product image:</form:label></td>
           <td><form:input path="image" value="${productEntity.image}"/></td>
       </tr>
	
		<tr>
         <td colspan="2"><input type="submit" value="Submit"/></td>
        </tr>
	
		</table>
	</form:form>
	
	
		
		<hr>
		
		<c:if test="${!empty products}">
  <h2>List Products</h2>
 <table align="left" border="1">
  <tr>
   <th>Product ID</th>
   <th>Product Name</th>
   <th>Product Description</th>
   <th>Product Price</th>
   <th>Product Image</th>
           <th>Actions on Row</th>
  </tr>




  <c:forEach items="${products}" var="product">
   <tr>
    <td><c:out value="${product.prodId}"/></td>
    <td><c:out value="${product.prodName}"/></td>
    <%-- <td><c:out value="${product.prodPrice}"/></td>
    <td><c:out value="${product.description}"/></td> --%>
    <td><c:out value="${product.image}"/></td>
    <td align="center">
	<%-- <a href="edit/${product.productId}">Edit</a> | 
	<a href="delete/${product.productId}">Delete</a></td> --%>
   </tr>
  </c:forEach>
 </table>
</c:if>
		
	</div>	
	




</body>


</div>
</html>
	