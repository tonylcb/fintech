package br.com.fiap.fintech.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.fiap.fintech.bean.Despesas;
import br.com.fiap.fintech.dao.DespesasDAO;
import br.com.fiap.fintech.singleton.ConnectionManager;

public class OracleDespesasDAO implements DespesasDAO {

	private Connection conexao;
	PreparedStatement pstmt = null;

	@Override
	public void cadastrar(Despesas despesa) {
		try {
			conexao = ConnectionManager.createConnection();
			pstmt = conexao.prepareStatement(
					"INSERT INTO T_SIP_DESPESAS(ID_CONTA, ID_DESPESAS, DS_DESPESA, DT_DESPESA, DS_CATEGORIA_DESP, NR_VALOR_DESPESA) VALUES (?, SEQ_DESPESAS.NEXTVAL, ?, ?, ?, ?)");

			pstmt.setInt(1, despesa.getIdConta());
			pstmt.setString(2, despesa.getDescDespesa());
			pstmt.setDate(3, new java.sql.Date(despesa.getDataDespesa().getTimeInMillis()));
			pstmt.setString(4, despesa.getDescCategoriaDespesa());
			pstmt.setInt(5, despesa.getNumeroValorDespesa());

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
	public List<Despesas> listar() {
		List<Despesas> lsDespesas = new ArrayList<Despesas>();
		ResultSet resultSet = null;

		try {
			conexao = ConnectionManager.createConnection();
			pstmt = conexao.prepareStatement("SELECT * FROM T_SIP_DESPESAS");
			resultSet = pstmt.executeQuery();

			while (resultSet.next()) {

				java.sql.Date data = resultSet.getDate("DT_DESPESA");
				Calendar dtDespesas = Calendar.getInstance();
				dtDespesas.setTimeInMillis(data.getTime());

				Despesas despesa = new Despesas(resultSet.getInt("ID_CONTA"), resultSet.getInt("ID_DESPESAS"),
						resultSet.getString("DS_DESPESA"), dtDespesas, resultSet.getString("DS_CATEGORIA_DESP"),
						resultSet.getInt("NR_VALOR_DESPESA"));

				lsDespesas.add(despesa);
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
		return lsDespesas;
	};

//	public Conta buscarTodosPorId(int id) {};

	@Override
	public void atualizar(Despesas despesa) {

		try {
			conexao = ConnectionManager.createConnection();
			pstmt = conexao.prepareStatement("UPDATE T_SIP_DESPESAS SET" + " ID_CONTA = ?," + " ID_DESPESAS = ?,"
					+ " DS_DESPESA = ?," + " DT_DESPESA = ?," + " DS_CATEGORIA_DESP = ?," + " NR_VALOR_DESPESA = ?"
					+ " WHERE ID_DESPESAS = ?");

			pstmt.setInt(1, despesa.getIdConta());
			pstmt.setInt(2, despesa.getIdDespesa());
			pstmt.setString(3, despesa.getDescDespesa());
			pstmt.setDate(4, new java.sql.Date(despesa.getDataDespesa().getTimeInMillis()));
			pstmt.setString(5, despesa.getDescCategoriaDespesa());
			pstmt.setInt(6, despesa.getNumeroValorDespesa());
			pstmt.setInt(7, despesa.getIdDespesa());
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
			pstmt = conexao.prepareStatement("DELETE FROM T_SIP_DESPESAS WHERE ID_DESPESAS = ?");
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