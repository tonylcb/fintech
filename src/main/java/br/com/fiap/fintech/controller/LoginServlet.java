package br.com.fiap.fintech.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.fiap.fintech.bean.Usuario;
import br.com.fiap.fintech.dao.UsuarioDAO;
import br.com.fiap.fintech.exception.DBException;
import br.com.fiap.fintech.factory.DAOFactory;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UsuarioDAO dao;

	public LoginServlet() {
		super();
		dao = DAOFactory.getUsuarioDAO();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");

		System.out.println(email);
		System.out.println(senha);

		if (email != null && senha != null && !email.isEmpty() && !senha.isEmpty()) {
			try {
				System.out.println(dao.validarUsuario(email, senha));
				if (dao.validarUsuario(email, senha)) {
					response.sendRedirect("tela-home.jsp");
				} else {
					response.sendRedirect("tela-login.jsp?error=invalid");
				}
			} catch (DBException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			response.sendRedirect("login.html?error=missing");
		}
	}

}
