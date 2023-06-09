<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head> <link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de usuario</title>
<%@ include file="header.jsp" %>
  <link rel="stylesheet" href="css/global.css" type="text/css"/>
	<link rel="stylesheet" href="css/login.css" type="text/css"/>
	<link rel="stylesheet" href="css/header.css" type="text/css"/>  
</head>
<body>
<%@ include file="menu.jsp" %>
	<c:if test="${not empty msg }">
	<div class="alert alert-success">${msg}</div>
	</c:if>
	<c:if test="${not empty erro}">
	<div class="alert alert-danger">${erro}</div>
	</c:if>
    <header class="header__section">
        <div class="header__container default-wrapper">
            <div class="header__first-element"></div>
            <div class="header__title">
                <h1>FIN</h1>
            </div>
            <div class="header__last-element">
            </div>
        </div>
    </header>
    <main class="login__container">
        <section class="form__section">
            <h1 class="form__title">Olá :)</h1>
            <form class="form__container">
                <input class="form__input-login" type="text" placeholder="Nome">
                <input class="form_input-login" type="text" placeholder="Sobrenome">
              	<input class="form_input-login" type="text" placeholder="Data de Nascimento">
              	<input class="form_input-login" type="text" placeholder="Email">
              	<input class="form__input-password" type="password" placeholder="Senha">
                <button class="form__button-submit">
                    <a href="home.jsp">
                        Cadastrar
                    </a>
                </button>
                
            </form>
        </section>
        <section class="buttons__section">
            
    </main>
<%@ include file="footer.jsp" %>
</body>
</html>