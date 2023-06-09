package br.com.fiap.fintech.dao;

import java.util.List;

import br.com.fiap.fintech.bean.Ganhos;
import br.com.fiap.fintech.exception.DBException;

public interface GanhosDAO {

	void cadastrar(Ganhos ganho) throws DBException;

	void atualizar(Ganhos ganho) throws DBException;

	void remover(int idGanhos) throws DBException;

//	Ganhos buscar(int idGanhos);

	List<Ganhos> listar();
}