<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" />

<!DOCTYPE html>
<html lang="pt-br">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="css/components/header/header.css">
<link rel="stylesheet" href="css/components/form/form.css">
<link rel="stylesheet" href="css/global.css">
<link rel="stylesheet" href="css/pages/login/login.css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Kodchasan:wght@300;400;500;700&display=swap"
	rel="stylesheet">
<title>Fin - Login</title>
</head>

<body>
	<header class="header__section">
	<div class="header__container default-wrapper">
		<div class="header__first-element"></div>
		<div class="header__title">
			<h1>FIN</h1>
		</div>
		<div class="header__last-element"></div>
	</div>
	</header>
	<main class="login__container"> <section class="form__section">
	<h1 class="form__title">Olá :)</h1>
	<form action="login" method="post" class="form__container">
		<input name="email" id="id-email"
			class="form__input-login" type="text" placeholder="email"> <input
			 name="senha" id="id-senha"
			class="form__input-password" type="password" placeholder="senha">
		<button class="form__button-submit" value="Entrar" type="submit">
		</button>
		<div class="form__forgot-container">
			<a class="form__forgot-bttn" href="#">Esqueci meu login ou senha</a>
		</div>
	</form>
	</section> <section class="buttons__section">
	<button class="buttons__google">
		<svg width="26" height="25" viewBox="0 0 26 25" fill="none"
			xmlns="http://www.w3.org/2000/svg"> <g
			clip-path="url(#clip0_9_27)"> <path
			d="M5.76215 15.1078L4.85713 18.3565L1.54929 18.4237C0.560727 16.6607 0 14.6436 0 12.5C0 10.4272 0.524266 8.47252 1.45356 6.75137H1.45427L4.39918 7.27051L5.68923 10.0852C5.41922 10.842 5.27206 11.6545 5.27206 12.5C5.27216 13.4176 5.44502 14.2967 5.76215 15.1078Z"
			fill="#FBBB00" /> <path
			d="M25.7728 10.1649C25.9221 10.921 26 11.7019 26 12.5C26 13.3949 25.9021 14.2679 25.7157 15.1099C25.0829 17.9753 23.4293 20.4774 21.1386 22.248L21.1379 22.2473L17.4286 22.0653L16.9036 18.9142C18.4236 18.057 19.6115 16.7157 20.2372 15.1099H13.2858V10.1649H25.7728Z"
			fill="#518EF8" /> <path
			d="M21.1378 22.2473L21.1385 22.2479C18.9107 23.9698 16.0807 25 13 25C8.04926 25 3.74499 22.3393 1.54926 18.4238L5.76212 15.1078C6.85996 17.9251 9.68639 19.9307 13 19.9307C14.4242 19.9307 15.7586 19.5604 16.9035 18.9141L21.1378 22.2473Z"
			fill="#28B446" /> <path
			d="M21.2978 2.87773L17.0864 6.19297C15.9014 5.48076 14.5007 5.06934 13 5.06934C9.61141 5.06934 6.73211 7.16685 5.68927 10.0852L1.45426 6.75137H1.45355C3.61714 2.74038 7.97569 0 13 0C16.1543 0 19.0464 1.08037 21.2978 2.87773Z"
			fill="#F14336" /> </g> <defs> <clipPath id="clip0_9_27">
		<rect width="26" height="25" fill="white" /> </clipPath> </defs> </svg>
		Entrar com conta Google
	</button>
	<button class="buttons__register" type="submit">
		<a href="cadastro-usuario.jsp">Cadastre-se </a>
	</button>

	</section> </main>
	<footer></footer>
</body>

</html>