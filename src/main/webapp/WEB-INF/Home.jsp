<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Seguros</title>
</head>
<body>
	<h1>Hello World</h1>
	
	<form:form servletRelativeAction="/insert" method="post" modelAttribute="insuranceRequest">
		<fieldset>
			<h3>Solicitante</h3>
			<div>
				<label>SSN</label>
				<form:input path="applicant.ssn" />
			</div>
			<div>
				<label>Primeiro Nome</label>
				<form:input path="applicant.firstName" />
			</div>
			<div>
				<label>Nome do meio</label>
				<form:input path="applicant.middleName" />
			</div>
			<div>
				<label>Último nome</label>
				<form:input path="applicant.lastName" />
			</div>
		</fieldset>
		<fieldset>
			<h3>Informação do seguro</h3>
			<div>
				<label>Produto</label>
				<form:input path="insuranceInfo.product" />
			</div>
			<div>
				<label>Tipo de cobertura</label>
				<form:input path="insuranceInfo.coverageType" />
			</div>
			<div>
				<label>Opção de cobertura</label>
				<form:input path="insuranceInfo.coverageOption" />
			</div>			
		</fieldset>
		<fieldset>
			<h3>Informação para a ferramenta</h3>		
			<div>
				<label>Número de contrato</label>
				<form:input path="widgetInfo.wgtContractNumber" />
			</div>
			<div>
				<label>Montante ($)</label>
				<form:input path="widgetInfo.wgtAmount" />
			</div>			
		</fieldset>
		<div>
			<input type="submit" value="Enviar">
		</div>
	</form:form>
	
	<c:if test="${ response != null }">
		<h2>Tudo ocorreu bem! Informação do seu seguro: </h2>
		<p>ID do seguro: ${ response.confirmationId }</p>
		<p>Montante: ${ response.amount }</p>
		<p>Data do pedido: ${ response.orderDate }</p>
	</c:if>
	
	
</body>
</html>