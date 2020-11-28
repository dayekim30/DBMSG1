<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<div id="main" >
	<h1>Hello</h1>
	<table>  
  <c:forEach items="${list}" var="item">
    <tr>
      <td> <c:out value="${item.getWep_type()}" />
       
       <c:out value="${item.getEvent_year()}" />
        <c:out value="${item.getNum()}" />
       
       
       
       </td>
    </tr>
  </c:forEach>
</table>

</div>
