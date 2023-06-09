package br.com.fiap.fintech.factory;

import br.com.fiap.fintech.dao.ContaDAO;
import br.com.fiap.fintech.dao.DespesasDAO;
import br.com.fiap.fintech.dao.GanhosDAO;
import br.com.fiap.fintech.dao.InvestimentosDAO;
import br.com.fiap.fintech.dao.UsuarioDAO;
import br.com.fiap.fintech.dao.impl.OracleContaDAO;
import br.com.fiap.fintech.dao.impl.OracleDespesasDAO;
import br.com.fiap.fintech.dao.impl.OracleGanhosDAO;
import br.com.fiap.fintech.dao.impl.OracleInvestimentosDAO;
import br.com.fiap.fintech.dao.impl.OracleUsuarioDAO;

public class DAOFactory {

	public static UsuarioDAO getUsuarioDAO() {
		return new OracleUsuarioDAO();
	}

	public static ContaDAO getContaDAO() {
		return new OracleContaDAO();
	}

	public static DespesasDAO getDespesasDAO() {
		return new OracleDespesasDAO();
	}

	public static GanhosDAO getGanhosDAO() {
		return new OracleGanhosDAO();
	}

	public static InvestimentosDAO getInvestimentosDAO() {
		return new OracleInvestimentosDAO();
	}

}