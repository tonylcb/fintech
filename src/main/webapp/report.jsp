
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/pages/report/report-report.css">
    <link rel="stylesheet" href="css/pages/report/report-dates.css">
    <link rel="stylesheet" href="css/pages/report/report-footer.css">
    <link rel="stylesheet" href="css/components/header/header.css">
    <link rel="stylesheet" href="css/global.css">
    <link href="https://fonts.googleapis.com/css2?family=Kodchasan:wght@300;400;500;700&display=swap" rel="stylesheet">
    <title>Fin - Relatório</title>
</head>

<body class="report__body">
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
                <h1 class="header__title-pages">Relatório - Caixa</h1>
            </div>
            <a href="home.jsp" class="header__icon header__last-element">
                <svg width="28" height="30" viewBox="0 0 28 30" fill="none" xmlns="http://www.w3.org/2000/svg">
                    <path d="M1.79999 12.4548V29H27V12.4548L14.4 1L1.79999 12.4548Z" stroke="#0E0E0E" stroke-width="2"
                        stroke-linecap="round" stroke-linejoin="round" />
                </svg>
            </a>
        </div>
    </header>
    <main class="report__main">
        <section class="report__section">
            <div class="report__container">
                <div class="report__button-container">

                    <ul class="report__list-container">
                        <li class="report__list-item default-wrapper">
                            <span class="report__list-item-title">Ração</span>
                            <span class="report__list-item-value report__item-value--negative">- R$ 350,00</span>

                        </li>
                    </ul>
                </div>
            </div>
            <div class="report__container">
                <div class="report__button-container">

                    <ul class="report__list-container">
                        <li class="report__list-item default-wrapper">
                            <span class="report__list-item-title">Seguro cartão</span>
                            <span class="report__list-item-value report__item-value--negative">- R$ 50,00</span>

                        </li>
                    </ul>
                </div>
            </div>
            <div class="report__container">
                <div class="report__button-container">

                    <ul class="report__list-container">
                        <li class="report__list-item default-wrapper">
                            <span class="report__list-item-title">Ifood</span>
                            <span class="report__list-item-value report__item-value--negative">- R$ 32,20</span>

                        </li>
                        <li class="report__list-item default-wrapper">
                            <span class="report__list-item-title">Restaurante UDON</span>
                            <span class="report__list-item-value report__item-value--negative">- R$ 98,10</span>

                        </li>
                        <li class="report__list-item default-wrapper">
                            <span class="report__list-item-title">Cachorro-quente</span>
                            <span class="report__list-item-value report__item-value--negative">- R$ 14,00</span>

                        </li>
                        <li class="report__list-item default-wrapper">
                            <span class="report__list-item-title">Açaí</span>
                            <span class="report__list-item-value report__item-value--negative">- R$ 32,00</span>

                        </li>
                    </ul>
                </div>
            </div>
            <div class="report__container">
                <div class="report__button-container">

                    <ul class="report__list-container">
                        <li class="report__list-item default-wrapper">
                            <span class="report__list-item-title">Salário</span>
                            <span class="report__list-item-value report__item-value--positive">+ R$ 3200,00</span>

                        </li>
                    </ul>
                </div>
            </div>
            <div class="report__container">
                <div class="report__button-container">

                    <ul class="report__list-container">
                        <li class="report__list-item default-wrapper">
                            <span class="report__list-item-title">Gás</span>
                            <span class="report__list-item-value report__item-value--negative">- R$ 130,00</span>

                        </li>
                        <li class="report__list-item default-wrapper">
                            <span class="report__list-item-title">Energia</span>
                            <span class="report__list-item-value report__item-value--negative">- R$ 140,00</span>

                        </li>
                        <li class="report__list-item default-wrapper">
                            <span class="report__list-item-title">Internet</span>
                            <span class="report__list-item-value report__item-value--negative">- R$ 99,00</span>

                        </li>
                        <li class="report__list-item default-wrapper">
                            <span class="report__list-item-title">Aluguel</span>
                            <span class="report__list-item-value report__item-value--negative">- R$ 825,00</span>

                        </li>
                    </ul>
                </div>
            </div>
        </section>
    </main>
    <footer class="footer__section default-wrapper">
        <div class="footer__container">
            <ul class="footer__list">
                <li class="footer__list-item">
                    Receita total: <span class="footer__list-item-value">R$ 3.200,00</span>
                </li>
                <li class="footer__list-item">
                    Despesa total: <span class="footer__list-item-value">R$ 2.504,85</span>
                </li>
                <li class="footer__list-item">
                    Saldo: <span class="footer__list-item-value report__item-value--positive">+ R$ 695,15</span>
                </li>
            </ul>
            <button class="footer__details">+ detalhes</button>
        </div>
    </footer>
</body>

</html>