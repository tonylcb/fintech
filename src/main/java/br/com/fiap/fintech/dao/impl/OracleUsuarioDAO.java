package br.com.fiap.fintech.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.fiap.fintech.bean.Usuario;
import br.com.fiap.fintech.dao.UsuarioDAO;
import br.com.fiap.fintech.singleton.ConnectionManager;

public class OracleUsuarioDAO implements UsuarioDAO {

	private Connection conexao;
	PreparedStatement pstmt = null;

	@Override
	public void cadastrar(Usuario usuario) {
		try {
			conexao = ConnectionManager.createConnection();
			pstmt = conexao.prepareStatement(
					"INSERT INTO T_SIP_USUARIO(ID_USUARIO, NOME, SOBRENOME, DTNASC, EMAIL , SENHA) VALUES (SEQ_USUARIO.NEXTVAL, ?, ? , ?, ?, ?)");

			pstmt.setString(1, usuario.getNome());
			pstmt.setString(2, usuario.getSobrenome());
			pstmt.setDate(3, new java.sql.Date(usuario.getDataNascimento().getTimeInMillis()));
			pstmt.setString(4, usuario.getEmail());
			pstmt.setString(5, usuario.getSenha());

			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				pstmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public boolean validarUsuario(String email, String senha) {
		String query = "SELECT * FROM T_SIP_USUARIO WHERE EMAIL=? AND SENHA=?";

		try (Connection conexao = ConnectionManager.createConnection();
				PreparedStatement pstmt = conexao.prepareStatement(query)) {
			pstmt.setString(1, email);
			pstmt.setString(2, senha);
			ResultSet resultSet = pstmt.executeQuery();

			System.out.println("é verdadeiro" + resultSet);

			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e);
		}

		return false;
	}
	
	@Override
	public Usuario buscar(int idUsuario) {
		Usuario usuario = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conexao = ConnectionManager.createConnection();
			stmt = conexao.prepareStatement("SELECT * FROM TB_PRODUTO WHERE CD_PRODUTO = ?");
			stmt.setInt(1, id);
			rs = stmt.executeQuery();

			if (rs.next()){
				int codigo = rs.getInt("CD_PRODUTO");
				String nome = rs.getString("NM_PRODUTO");
				int qtd = rs.getInt("QT_PRODUTO");
				double valor = rs.getDouble("VL_PRODUTO");
				java.sql.Date data = rs.getDate("DT_FABRICACAO");
				Calendar dataFabricacao = Calendar.getInstance();
				dataFabricacao.setTimeInMillis(data.getTime());
				
				produto = new Produto(codigo, nome, valor, dataFabricacao, qtd);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				rs.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return produto;
	}

}