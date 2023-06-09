<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
     <link rel="stylesheet" href="css/components/header/header.css">
    <link rel="stylesheet" href="css/components/menu/menu-dashboard.css">
    <link rel="stylesheet" href="css/components/profile/profile.css">
    <link rel="stylesheet" href="css/components/form/form.css">
    <link rel="stylesheet" href="css/global.css">
    <link href="https://fonts.googleapis.com/css2?family=Kodchasan:wght@300;400;500;700&display=swap" rel="stylesheet">
</head>

<body>
    <header class="header__section">
        <div class="header__container default-wrapper">
            <div class="header__first-element">
                <button class="header__menu-bttn">
                    <svg width="32" height="26" viewBox="0 0 32 26" fill="none" xmlns="http://www.w3.org/2000/svg">
                        <rect width="32" height="4" rx="2" fill="#0E0E0E" />
                        <rect y="11" width="32" height="4" rx="2" fill="#0E0E0E" />
                        <rect y="22" width="32" height="4" rx="2" fill="#0E0E0E" />
                    </svg>
                </button>
            </div>
            <div class="header__title">
                <h1 class="header__title-pages">Adicionar conta</h1>
            </div>
            <a href="../home/home.html" class="header__icon header__last-element">
                <svg width="28" height="30" viewBox="0 0 28 30" fill="none" xmlns="http://www.w3.org/2000/svg">
                    <path d="M1.79999 12.4548V29H27V12.4548L14.4 1L1.79999 12.4548Z" stroke="#0E0E0E" stroke-width="2"
                        stroke-linecap="round" stroke-linejoin="round" />
                </svg>
            </a>
        </div>
    </header>
    <main class="add-account__container">
        <section class="form__section">
            <form class="form__container">
                <fieldset>
                    <label for="bank-name">Nome do banco</label>
                    <input class="form__input" id="bank-name" type="text" placeholder="Ex: Caixa">
                </fieldset>
                <fieldset>
                    <label for="agencia-type">Número da agência</label>
                    <input class="form__input" type="password" id="agencia-type" placeholder="Agência">
                </fieldset>
                <fieldset>
                    <label for="conta-type">Número da conta</label>
                    <input class="form__input" type="password" id="conta-type" placeholder="Conta">
                </fieldset>
                <fieldset>
                    <label for="saldo-type">Saldo</label>
                    <input class="form__input" type="password" id="saldo-type" placeholder="Saldo">
                </fieldset>
                <button class="form__button-submit">
                    <a href="home.jsp">
                        Adicionar
                    </a>
                </button>
            </form>
        </section>
    </main>
</body>

</html>