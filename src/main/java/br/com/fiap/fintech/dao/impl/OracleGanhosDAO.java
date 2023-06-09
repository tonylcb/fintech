package br.com.fiap.fintech.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.fiap.fintech.bean.Ganhos;
import br.com.fiap.fintech.dao.GanhosDAO;
import br.com.fiap.fintech.singleton.ConnectionManager;

public class OracleGanhosDAO implements GanhosDAO {

	private Connection conexao;
	PreparedStatement pstmt = null;

	@Override
	public void cadastrar(Ganhos ganhos) {
		try {
			conexao = ConnectionManager.createConnection();
			pstmt = conexao.prepareStatement(
					"INSERT INTO T_SIP_GANHOS(ID_CONTA, ID_GANHOS, DS_GANHOS, DT_RECEBIMENTO, NR_VALOR, DS_CATEGORIA) VALUES (?, SEQ_GANHOS.NEXTVAL, ?, ?, ?, ?)");

			pstmt.setInt(1, ganhos.getIdConta());
			pstmt.setString(2, ganhos.getDescGanhos());
			pstmt.setDate(3, new java.sql.Date(ganhos.getDataRecebimento().getTimeInMillis()));
			pstmt.setInt(4, ganhos.getNumeroValor());
			pstmt.setString(5, ganhos.getDescCategoria());

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
	public List<Ganhos> listar() {
		List<Ganhos> lsGanhos = new ArrayList<Ganhos>();
		ResultSet resultSet = null;

		try {
			conexao = ConnectionManager.createConnection();
			pstmt = conexao.prepareStatement("SELECT * FROM T_SIP_GANHOS");
			resultSet = pstmt.executeQuery();

			while (resultSet.next()) {

				java.sql.Date data = resultSet.getDate("DT_RECEBIMENTO");
				Calendar dtGanhos = Calendar.getInstance();
				dtGanhos.setTimeInMillis(data.getTime());

				Ganhos ganhos = new Ganhos(resultSet.getInt("ID_CONTA"), resultSet.getInt("ID_GANHOS"),
						resultSet.getString("DS_GANHOS"), dtGanhos, resultSet.getInt("NR_VALOR"),
						resultSet.getString("DS_CATEGORIA"));

				lsGanhos.add(ganhos);
			}
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
		return lsGanhos;
	};

//	public Conta buscarTodosPorId(int id) {};

	@Override
	public void atualizar(Ganhos ganhos) {

		try {
			conexao = ConnectionManager.createConnection();
			pstmt = conexao.prepareStatement(
					"UPDATE T_SIP_GANHOS SET" + " ID_CONTA = ?," + " ID_GANHOS = ?," + " DS_GANHOS = ?,"
							+ " DT_RECEBIMENTO = ?," + " NR_VALOR = ?," + " DS_CATEGORIA = ?" + " WHERE ID_GANHOS = ?");

			pstmt.setInt(1, ganhos.getIdConta());
			pstmt.setInt(2, ganhos.getIdGanhos());
			pstmt.setString(3, ganhos.getDescGanhos());
			pstmt.setDate(4, new java.sql.Date(ganhos.getDataRecebimento().getTimeInMillis()));
			pstmt.setInt(5, ganhos.getNumeroValor());
			pstmt.setString(6, ganhos.getDescCategoria());
			pstmt.setInt(7, ganhos.getIdGanhos());
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
			pstmt = conexao.prepareStatement("DELETE FROM T_SIP_GANHOS WHERE ID_GANHOS = ?");
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