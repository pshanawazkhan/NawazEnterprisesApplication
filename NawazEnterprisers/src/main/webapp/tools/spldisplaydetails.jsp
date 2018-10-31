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
<H1 align="Left">Nawaz Enterprisers Splinker Items price List</H1>
<table border="1">
        <tr bgcolor="PINK" >
           <td>Id </td>
            <td> ProductName:</td>
            
            <td>Place Of Supply:</td>
            <td>Price:</td>
       </tr>
       
       <c:forEach items="${List.splTo}" var="item">
    <tr>
      <td><c:out value="${item.id}" /></td>
      <td><c:out value="${item.productname}" /></td>
      <td><c:out value="${item.place}" /></td>
      <td><c:out value="${item.price}" /></td>
    </tr>
  </c:forEach>
 </table>
 
 <a href="splloginSubmit1">Add Another Splinker items please click hear</a> <br><br>



<a href="spllogin">To go for Splinker Login Page please click hear</a> <br><br>
</body>
</html>