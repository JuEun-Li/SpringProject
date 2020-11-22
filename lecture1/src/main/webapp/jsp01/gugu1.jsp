<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<style>
	table { border-collapse: collapse; }
    td { padding: 5px; border: solid 1px gray; }
</style>
<body>
	<table>
		<tbody>	
				<c:forEach var="i" begin="1" end="9" step="1">
					<tr>
					<c:forEach var="j" begin="2" end="9" step="1">
						<td>${ j } x ${ i }= ${ j * i }</td>
					</c:forEach>
					</tr>
				</c:forEach>		
		</tbody>
	</table>
</body>
<!-- <c:forEach var="i" begin="2" end="9" step="1">
					<tr>
					<c:forEach var="j" begin="1" end="9" step="1">
						<td>${ i } x ${ j }= ${ i * j }</td>
					</c:forEach>
					</tr>
				</c:forEach>		
		</tbody> -->
</html>
