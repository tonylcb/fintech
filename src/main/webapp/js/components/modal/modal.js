function handleModal() {
    const closeReceitaBttn = document.querySelector('.modal__receita-close');
    const modalReceitaSection = document.querySelector('.modal__receita-container');
    const addReceitaBttn = document.querySelector('.menu__item-adicionar-receita')

    const closeDespesaBttn = document.querySelector('.modal__despesa-close');
    const modalDespesaSection = document.querySelector('.modal__despesa-container');
    const addDespesaBttn = document.querySelector('.menu__item-adicionar-despesa')

    const closeInvestimentoBttn = document.querySelector('.modal__investimento-close');
    const modalInvestimentoSection = document.querySelector('.modal__investimento-container');
    const addInvestimentoBttn = document.querySelector('.menu__item-adicionar-investimento')

    addReceitaBttn.addEventListener('click', () => {
        modalReceitaSection.classList.remove('modal-closed')
    })

    closeReceitaBttn.addEventListener('click', () => {
        modalReceitaSection.classList.add('modal-closed')
    })

    addDespesaBttn.addEventListener('click', () => {
        modalDespesaSection.classList.remove('modal-closed')
    })

    closeDespesaBttn.addEventListener('click', () => {
        modalDespesaSection.classList.add('modal-closed')
    })

    addInvestimentoBttn.addEventListener('click', () => {
        modalInvestimentoSection.classList.remove('modal-closed')
    })

    closeInvestimentoBttn.addEventListener('click', () => {
        modalInvestimentoSection.classList.add('modal-closed')
    })
}

window.addEventListener("DOMContentLoaded", () => {
    handleModal();
})