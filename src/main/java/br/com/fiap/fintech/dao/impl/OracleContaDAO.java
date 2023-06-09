package br.com.fiap.fintech.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.fiap.fintech.bean.Conta;
import br.com.fiap.fintech.dao.ContaDAO;
import br.com.fiap.fintech.singleton.ConnectionManager;

public class OracleContaDAO implements ContaDAO {

	private Connection conexao;
	PreparedStatement pstmt = null;

	@Override
	public void cadastrar(Conta conta) {
		try {
			conexao = ConnectionManager.createConnection();
			pstmt = conexao.prepareStatement(
					"INSERT INTO T_SIP_CONTA(ID_CONTA, ID_USUARIO, NM_BANCO, NR_AGENCIA, NR_CONTA, NR_SALDO, DT_EXTRATO) VALUES (SEQ_CONTA.NEXTVAL, ?, ?, ?, ?, ?, ?)");

			pstmt.setInt(1, conta.getIdUsuario());
			pstmt.setString(2, conta.getNomeBanco());
			pstmt.setInt(3, conta.getNumeroAgencia());
			pstmt.setInt(4, conta.getNumeroConta());
			pstmt.setFloat(5, conta.getSaldo());
			pstmt.setDate(6, new java.sql.Date(conta.getDataExtrato().getTimeInMillis()));

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

	@Override
	public List<Conta> listarPorIdUsuario(int idUsuario) {
		List<Conta> contas = new ArrayList<Conta>();

		try {
			conexao = ConnectionManager.createConnection();
			String selectContasQuery = "SELECT * FROM T_SIP_CONTA WHERE ID_USUARIO = ?";
			try (PreparedStatement pstmt = conexao.prepareStatement(selectContasQuery)) {
				pstmt.setInt(1, idUsuario);
				try (ResultSet resultSet = pstmt.executeQuery()) {
					while (resultSet.next()) {
						java.sql.Date data = resultSet.getDate("DT_EXTRATO");
						Calendar dtExtrato = Calendar.getInstance();
						dtExtrato.setTimeInMillis(data.getTime());

						Conta conta = new Conta();
						conta.setIdConta(resultSet.getInt("ID_CONTA"));
						conta.setIdUsuario(resultSet.getInt("ID_USUARIO"));
						conta.setNomeBanco(resultSet.getString("NM_BANCO"));
						conta.setNumeroAgencia(resultSet.getInt("NR_AGENCIA"));
						conta.setNumeroConta(resultSet.getInt("NR_CONTA"));
						conta.setSaldo(resultSet.getFloat("NR_SALDO"));
						conta.setDataExtrato(dtExtrato);
						contas.add(conta);

					}

				}

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return contas;
	};

	@Override
	public void atualizar(Conta conta) {

		try {
			conexao = ConnectionManager.createConnection();
			pstmt = conexao.prepareStatement("UPDATE T_SIP_CONTA SET" + " NM_BANCO = ?," + " NR_AGENCIA = ?,"
					+ " NR_CONTA = ?," + " NR_SALDO = ?," + " DT_EXTRATO = ?" + " WHERE ID_CONTA = ?");

			pstmt.setString(1, conta.getNomeBanco());
			pstmt.setInt(2, conta.getNumeroAgencia());
			pstmt.setInt(3, conta.getNumeroConta());
			pstmt.setFloat(4, conta.getSaldo());
			pstmt.setDate(5, new java.sql.Date(conta.getDataExtrato().getTimeInMillis()));
			pstmt.setInt(6, conta.getIdConta());
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
	};

	@Override
	public void remover(int id) {

		try {
			conexao = ConnectionManager.createConnection();
			pstmt = conexao.prepareStatement("DELETE FROM T_SIP_CONTA WHERE ID_CONTA = ?");
			pstmt.setInt(1, id);
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
	};
}