<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adicionar contas</title>
<%@ include file="header.jsp"%>
</head>
<body>
	<%@ include file="menu.jsp"%>
	<div class="container">
		<h1>Contas</h1>
		<c:if test="${not empty msg }">
			<div class="alert alert-success">${msg}</div>
		</c:if>
		<c:if test="${not empty erro }">
			<div class="alert alert-danger">${erro}</div>
		</c:if>
		<form action="conta" method="post">
			<input type="hidden" value="cadastrar" name="acao">
			<div class="form-group">
				<label for="id-nomeBanco">Nome Banco</label> <input type="text"
					name="nomeBanco" id="id-nomeBanco" class="form-control">
			</div>
			<div class="form-group">
				<label for="id-numeroAgencia">Numero Agencia</label> <input
					type="text" name="numeroAgencia" id="id-numeroAgencia"
					class="form-control">
			</div>
			<div class="form-group">
				<label for="id-numeroConta">Numero Conta</label> <input
					type="text" name="numeroConta" id="id-numeroConta"
					class="form-control">
			</div>
			<div class="form-group">
				<label for="id-saldo">Saldo</label> <input
					type="text" name="saldo" id="id-saldo"
					class="form-control">
			</div>
			<div class="form-group">
				<label for="id-dataExtrato">Data Extrato</label> <input
					type="text" name="dataExtrato" id="id-dataExtrato"
					class="form-control">
			</div>
			<input type="submit" value="Salvar" class="btn btn-primary">
		</form>
	</div>
	<%@ include file="footer.jsp"%>
</body>
</html>