<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<H1 align="Left">Nawaz Enterprisers Spanars  Items price List</H1>
<table border="1" >
<tr bgcolor="pink" >
<td>ID                </td>
<td>ProductName       </td>
<td>Place Of Supply   </td>
<td>Price             </td>
</tr>

<c:forEach items="${List1.spato}" var="item">
    <tr bgcolor="yellow">
      <td ><c:out value="${item.id}" /></td>
      <td><c:out value="${item.productname}" /></td>
      <td><c:out value="${item.place}" /></td>
      <td><c:out value="${item.price}" /></td>
    </tr>
  </c:forEach>
 </table>
 
 <a href="spnarloginSubmit1">Add Another Spanars items please click hear</a> <br><br>



<a href="spnarlogin">To go for Spanars Login Page please click hear</a> <br><br>
</body>
</html>