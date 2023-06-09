package br.com.fiap.fintech.dao;

import java.util.List;

import br.com.fiap.fintech.bean.Conta;
import br.com.fiap.fintech.bean.Usuario;
import br.com.fiap.fintech.exception.DBException;

public interface ContaDAO {

	void cadastrar(Conta conta) throws DBException;

	void atualizar(Conta conta) throws DBException;

	void remover(int id) throws DBException;

	List<Conta> listarPorIdUsuario(int idUsuario);

}