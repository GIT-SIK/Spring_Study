<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Title</title>
  </head>
  <body>
    Controller String Data : ${tempString}
    <hr>

    <%--
    <c:forEach var="tempListData" items="${tempList}" varStatus="status">
      Controller List[${status.count}}] Data : <c:out value="${tempListData}"/>
    </c:forEach>
    --%>
  </body>
</html>
