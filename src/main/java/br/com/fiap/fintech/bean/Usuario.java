package br.com.fiap.fintech.bean;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	private int idUsuario;
	private String nome;
	private String sobrenome;
	private Calendar dataNascimento;
	private String email;
	private String senha;
	private List<Conta> contas;

	public Usuario() {
		super();
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public Usuario(int idUsuario, String nome, String sobrenome, Calendar dataNascimento, String email, String senha,
			List<Conta> contas) {
		super();
		this.idUsuario = idUsuario;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.senha = senha;
		this.contas = contas;
	}

}
