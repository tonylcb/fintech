package br.com.fiap.fintech.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.fintech.bean.Conta;
import br.com.fiap.fintech.dao.ContaDAO;
import br.com.fiap.fintech.exception.DBException;
import br.com.fiap.fintech.factory.DAOFactory;

/**
 * Servlet implementation class ContaServle
 */
@WebServlet("/conta")
public class ContaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ContaDAO dao;

	@Override
	public void init() throws ServletException {
		super.init();
		dao = DAOFactory.getContaDAO();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			int idUsuario = Integer.parseInt(request.getParameter("idUsuario"));
			String nomeBanco = request.getParameter("nomeBanco");
			int numeroAgencia = Integer.parseInt(request.getParameter("numeroAgencia"));
			int numeroConta = Integer.parseInt(request.getParameter("numeroConta"));
			float saldo = Float.parseFloat(request.getParameter("saldo"));
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			Calendar dataExtrato = Calendar.getInstance();
			dataExtrato.setTime(format.parse(request.getParameter("dataExtrato")));

			Conta conta = new Conta(1, 0, nomeBanco, numeroAgencia, numeroConta, saldo, dataExtrato);
			dao.cadastrar(conta);

			request.setAttribute("msg", "Conta cadastrada!");
		} catch (DBException db) {
			db.printStackTrace();
			request.setAttribute("erro", "Erro ao cadastrar");
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("erro", "Por favor, valide os dados");
		}
		request.getRequestDispatcher("cadastro-conta.jsp").forward(request, response);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Conta> lista = dao.listarPorIdUsuario(1);
		request.setAttribute("contas", lista);
		request.getRequestDispatcher("lista-conta" + ".jsp").forward(request, response);
	}

}
