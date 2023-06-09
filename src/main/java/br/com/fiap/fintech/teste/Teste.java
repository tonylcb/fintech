package br.com.fiap.fintech.teste;

import java.util.List;

import br.com.fiap.fintech.bean.Conta;
import br.com.fiap.fintech.bean.Despesas;
import br.com.fiap.fintech.bean.Ganhos;
import br.com.fiap.fintech.bean.Investimentos;
import br.com.fiap.fintech.dao.ContaDAO;
import br.com.fiap.fintech.dao.DespesasDAO;
import br.com.fiap.fintech.dao.GanhosDAO;
import br.com.fiap.fintech.dao.InvestimentosDAO;
import br.com.fiap.fintech.dao.impl.OracleContaDAO;
import br.com.fiap.fintech.dao.impl.OracleDespesasDAO;
import br.com.fiap.fintech.dao.impl.OracleGanhosDAO;
import br.com.fiap.fintech.dao.impl.OracleInvestimentosDAO;

public class Teste {

	public static void main(String[] args) throws ClassNotFoundException {

		try {

			ContaDAO contaDAO = new OracleContaDAO();
			Conta conta = new Conta();

			DespesasDAO despesasDAO = new OracleDespesasDAO();
			Despesas despesas = new Despesas();

			GanhosDAO ganhosDAO = new OracleGanhosDAO();
			Ganhos ganhos = new Ganhos();

			InvestimentosDAO investimentosDAO = new OracleInvestimentosDAO();
			Investimentos investimentos = new Investimentos();

			// CONTAS
//			conta.setNomeBanco("Inter");
//			conta.setNumeroAgencia(12123);
//			conta.setNumeroConta(93393);
//			conta.setSaldo(0);
//			Calendar calendar = new GregorianCalendar(2017, 8, 10);
//			conta.setDataExtrato(calendar);
//
//			contaDAO.gravar(conta);

//			conta.setId(8);
//			conta.setSaldo(220);
//			conta.setNomeBanco("Itau");
//			conta.setNumeroConta(0001);
//			Calendar calendar = new GregorianCalendar(2022, 9, 28);
//			conta.setDataExtrato(calendar);
//			contaDAO.atualizar(conta);
//
//			contaDAO.remover(21);

			// DESPESAS
//			despesas.setIdConta(42);
//			despesas.setDescDespesa("Mercadinho BigBang");
//			Calendar calendar = new GregorianCalendar(2023, 4, 18);
//			despesas.setDataDespesa(calendar);
//			despesas.setDescCategoriaDespesa("Variavel");
//			despesas.setNumeroValorDespesa(70);
//
//			despesasDAO.gravar(despesas);
//			
			// GANHOS
//			ganhos.setIdConta(43);
//			ganhos.setDescGanhos("Pix do tony");
//			Calendar calendar = new GregorianCalendar(2023, 5, 2);
//			ganhos.setDataRecebimento(calendar);
//			ganhos.setDescCategoria("trabalho autonomo");
//			ganhos.setNumeroValor(70);
//
//			ganhosDAO.gravar(ganhos);
//			
//			ganhos.setIdConta(42);
//			ganhos.setDescGanhos("Transferencia da cecilia");
//			calendar = new GregorianCalendar(2023, 2, 10);
//			ganhos.setDataRecebimento(calendar);
//			ganhos.setDescCategoria("trabalho autonomo");
//			ganhos.setNumeroValor(120);
//
//			ganhosDAO.gravar(ganhos);
//			
//			ganhos.setIdConta(43);
//			ganhos.setDescGanhos("TED da Wel");
//			calendar = new GregorianCalendar(2022, 12, 12);
//			ganhos.setDataRecebimento(calendar);
//			ganhos.setDescCategoria("trabalho autonomo");
//			ganhos.setNumeroValor(40);
//
//			ganhosDAO.gravar(ganhos);
//			
//			ganhos.setIdConta(42);
//			ganhos.setDescGanhos("Pagamento Salario");
//			calendar = new GregorianCalendar(2022, 7, 20);
//			ganhos.setDataRecebimento(calendar);
//			ganhos.setDescCategoria("trabalho autonomo");
//			ganhos.setNumeroValor(25);
//
//			ganhosDAO.gravar(ganhos);
//			
//			ganhos.setIdConta(43);
//			ganhos.setDescGanhos("Mesada");
//			calendar = new GregorianCalendar(2023, 5, 1);
//			ganhos.setDataRecebimento(calendar);
//			ganhos.setDescCategoria("trabalho autonomo");
//			ganhos.setNumeroValor(30);
//
//			ganhosDAO.gravar(ganhos);
//			
//			//INVESTIMENTOS
//			investimentos.setIdConta(42);
//			investimentos.setDescInvestimento("IBOV");
//			Calendar calendar = new GregorianCalendar(2023, 4, 30);
//			investimentos.setDataInvestimento(calendar);
//			investimentos.setDescCategoriaInvestimento("Variavel");
//			investimentos.setNumeroValorInvestimento(500);
//
//			investimentosDAO.gravar(investimentos);

			// CONTAS
			List<Conta> contas = contaDAO.listarPorIdUsuario(21);

			for (Conta item : contas) {

				System.out.println(item.toString());
			}

			// DESPESAS
			List<Despesas> lsDespesas = despesasDAO.listar();

			for (Despesas item : lsDespesas) {

				System.out.println(item.toString());
			}

			// GANHOS
			List<Ganhos> lsGanhos = ganhosDAO.listar();

			for (Ganhos item : lsGanhos) {

				System.out.println(item.toString());
			}

			// INVESTIMENTOS
			List<Investimentos> lsInvestimentos = investimentosDAO.listar();

			for (Investimentos item : lsInvestimentos) {

				System.out.println(item.toString());
			}

		} catch (Exception e) {
			System.err.println(e);
		}
	}
}