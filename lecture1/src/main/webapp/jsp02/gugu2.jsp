<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<style>
table {
	border-collapse: collapse;
	display: inline;
}

td {
	padding: 5px;
	border: solid 1px gray;
}
</style>
<body>
	<table>
		<tbody>
			<tr>
				<c:forEach var="i" begin="2" end="9" step="1">
					<td><c:forEach var="j" begin="1" end="9" step="1">
						${ i } x ${ j }= ${ i * j }<br>
						</c:forEach></td>
				</c:forEach>
			</tr>
		</tbody>
	</table>
</body>
</html>
