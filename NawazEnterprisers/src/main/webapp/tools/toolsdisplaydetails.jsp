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
<table border="1">
        <tr bgcolor="Pink" >
           <td>Id </td>
            <td> ProductName:</td>
            
            <td>Place Of Supply:</td>
            <td>Price:</td>
       </tr>
       
       <c:forEach items="${List1.l1}" var="item">
    <tr>
      <td><c:out value="${item.id}" /></td>
      <td><c:out value="${item.productname}" /></td>
      <td><c:out value="${item.place}" /></td>
      <td><c:out value="${item.price}" /></td>
    </tr>
  </c:forEach>
 </table>
 
 <a href="toolsLoginSubmit1">Add Another TOOLS items please click hear</a> <br><br>



<a href="toolslogin">To go for TOOLS Login Page please click hear</a> <br><br>
</body>
</html>