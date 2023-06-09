package br.com.fiap.fintech.dao;

import java.util.List;

import br.com.fiap.fintech.bean.Despesas;
import br.com.fiap.fintech.exception.DBException;

public interface DespesasDAO {

	void cadastrar(Despesas despesa) throws DBException;

	void atualizar(Despesas despesa) throws DBException;

	void remover(int idDespesa) throws DBException;

//	Despesas buscar(int idDespesa);

	List<Despesas> listar();
}