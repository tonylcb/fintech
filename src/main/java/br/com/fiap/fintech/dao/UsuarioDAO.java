package br.com.fiap.fintech.dao;

import br.com.fiap.fintech.bean.Usuario;
import br.com.fiap.fintech.exception.DBException;

public interface UsuarioDAO {

	void cadastrar(Usuario usuario) throws DBException;
	
	boolean validarUsuario(String email, String senha) throws DBException;
	
	Usuario buscar(int idUsuario);
}
