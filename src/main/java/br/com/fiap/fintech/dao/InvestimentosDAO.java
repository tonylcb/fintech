package br.com.fiap.fintech.dao;

import java.util.List;

import br.com.fiap.fintech.bean.Investimentos;
import br.com.fiap.fintech.exception.DBException;

public interface InvestimentosDAO {

	void cadastrar(Investimentos investimento) throws DBException;

	void atualizar(Investimentos investimento) throws DBException;

	void remover(int idInvestimentos) throws DBException;

//	Investimentos buscar(int idInvestimentos);

	List<Investimentos> listar();
}