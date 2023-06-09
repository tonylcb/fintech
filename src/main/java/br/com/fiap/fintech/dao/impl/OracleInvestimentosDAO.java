package br.com.fiap.fintech.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.fiap.fintech.bean.Investimentos;
import br.com.fiap.fintech.dao.InvestimentosDAO;
import br.com.fiap.fintech.singleton.ConnectionManager;

public class OracleInvestimentosDAO implements InvestimentosDAO {

	private Connection conexao;
	PreparedStatement pstmt = null;

	@Override
	public void cadastrar(Investimentos investimentos) {
		try {
			conexao = ConnectionManager.createConnection();
			pstmt = conexao.prepareStatement(
					"INSERT INTO T_SIP_INVESTIMENTOS(ID_CONTA, ID_INVESTIMENTOS, DS_INVESTIMENTO, DT_INVESTIMENTO, DS_CATEGORIA_INVEST, NR_VALOR_INVEST) VALUES (?, SEQ_INVESTIMENTOS.NEXTVAL, ?, ?, ?, ?)");

			pstmt.setInt(1, investimentos.getIdConta());
			pstmt.setString(2, investimentos.getDescInvestimento());
			pstmt.setDate(3, new java.sql.Date(investimentos.getDataInvestimento().getTimeInMillis()));
			pstmt.setString(4, investimentos.getDescCategoriaInvestimento());
			pstmt.setInt(5, investimentos.getNumeroValorInvestimento());

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

//	@Override
//	public Investimentos buscar(int idInvestimento) {
//		Investimentos investimento = null;
//		PreparedStatement stmt = null;
//		ResultSet rs = null;
//		try {
//			conexao = ConnectionManager.getInstance().getConnection();
//			stmt = conexao.prepareStatement("SELECT * FROM TB_PRODUTO WHERE CD_PRODUTO = ?");
//			stmt.setInt(1, idInvestimento);
//			rs = stmt.executeQuery();
//
//			if (rs.next()) {
//				int codigo = rs.getInt("CD_PRODUTO");
//				String nome = rs.getString("NM_PRODUTO");
//				int qtd = rs.getInt("QT_PRODUTO");
//				double valor = rs.getDouble("VL_PRODUTO");
//				java.sql.Date data = rs.getDate("DT_FABRICACAO");
//				Calendar dataFabricacao = Calendar.getInstance();
//				dataFabricacao.setTimeInMillis(data.getTime());
//
//				produto = new Produto(codigo, nome, valor, dataFabricacao, qtd);
//			}
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				stmt.close();
//				rs.close();
//				conexao.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//		return produto;
//	}

	@Override
	public List<Investimentos> listar() {
		List<Investimentos> lsInvestimentos = new ArrayList<Investimentos>();
		ResultSet resultSet = null;

		try {
			conexao = ConnectionManager.createConnection();
			pstmt = conexao.prepareStatement("SELECT * FROM T_SIP_INVESTIMENTOS");
			resultSet = pstmt.executeQuery();

			while (resultSet.next()) {

				java.sql.Date data = resultSet.getDate("DT_INVESTIMENTO");
				Calendar dtInvestimentos = Calendar.getInstance();
				dtInvestimentos.setTimeInMillis(data.getTime());

				Investimentos investimentos = new Investimentos(resultSet.getInt("ID_CONTA"),
						resultSet.getInt("ID_INVESTIMENTOS"), resultSet.getString("DS_INVESTIMENTO"), dtInvestimentos,
						resultSet.getString("DS_CATEGORIA_INVEST"), resultSet.getInt("NR_VALOR_INVEST"));

				lsInvestimentos.add(investimentos);
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
		return lsInvestimentos;
	};

//	public Conta buscarTodosPorId(int id) {};

	@Override
	public void atualizar(Investimentos investimentos) {

		try {
			conexao = ConnectionManager.createConnection();
			pstmt = conexao.prepareStatement("UPDATE T_SIP_INVESTIMENTOS SET" + " ID_CONTA = ?,"
					+ " ID_INVESTIMENTOS = ?," + " DS_INVESTIMENTO = ?," + " DT_INVESTIMENTO = ?,"
					+ " DS_CATEGORIA_INVEST = ?," + " NR_VALOR_INVEST = ?" + " WHERE ID_INVESTIMENTOS = ?");

			pstmt.setInt(1, investimentos.getIdConta());
			pstmt.setInt(2, investimentos.getIdInvestimento());
			pstmt.setString(3, investimentos.getDescInvestimento());
			pstmt.setDate(4, new java.sql.Date(investimentos.getDataInvestimento().getTimeInMillis()));
			pstmt.setString(5, investimentos.getDescCategoriaInvestimento());
			pstmt.setInt(6, investimentos.getNumeroValorInvestimento());
			pstmt.setInt(7, investimentos.getIdInvestimento());
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
			pstmt = conexao.prepareStatement("DELETE FROM T_SIP_INVESTIMENTOS WHERE ID_INVESTIMENTOS = ?");
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